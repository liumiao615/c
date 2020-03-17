public class HashMap<K, V> implements Map<K, V> {
    // 要求 table.length 必须是 2 的幂次方
    private Entry<K, V>[] table = new Entry[16];
    // HashMap 中已经保存的有效 key 的个数
    private int size = 0;

    private static final double LOADER_FACTOR_THRESHOLD = 0.75;

    // 时间复杂度是 O(1)
    @Override
    public V get(K key) {
        // 1. 根据 key 得到 下标

        // 1.1 求出 key 的 hashCode();
        /**
         * 这里使用了 hashCode() ->
         * 如果要使用自定义的类作为 HashMap 的 K 类型
         * 则，必须在类中覆写 hashCode() AND 相同的 key.hashCode() 相等
         * 否则，无法根据相同的 key 找到唯一的下标
          */
        int hash = key.hashCode();

        /**
         * 这个的作用的是让 hash 中的每一位都参与到找下标中
         * 使得找到的下标，尽可能均匀
         */
        hash = (hash >>> 16) ^ hash;

        // 1.2 利用 hash 得到合法的下标
        /**
         * 前提：这里利用 table.length 一定是 2 的幂次方 这个特点
         * 利用位运算思考，为什么这么计算之后，得到的下标就是合法的
         */
        int index = hash & (table.length - 1);

        // 2. 使用下标，找到链表的头结点的引用
        Entry<K, V> head = table[index];

        // 3. 在链表中，找到包含 key 的结点，返回存在结点中的 value
        //    即和 key 关联的 value
        // 方法就是遍历链表，去找
        Entry<K, V> node = head;
        while (node != null) {
            /**
             * 这里使用了 key 的 equals 方法 ->
             * 如果使用自定义类作为 HashMap 的key
             * 必须覆写类的 equals 方法，保证你认为相同的 key，equals 返回true
             * 否则，无法正确找到 value
             */
            if (key.equals(node.key)) {
                return node.value;
            }

            node = node.next;
        }

        // 链表遍历结束了，没有找到
        return null;
    }

    @Override
    public V put(K key, V value) {
        // 1. 根据 key 得到 下标
        int index;
        if (key == null) {
            index = 0;
        } else {

            // 1.1 求出 key 的 hashCode();
            /**
             * 这里使用了 hashCode() ->
             * 如果要使用自定义的类作为 HashMap 的 K 类型
             * 则，必须在类中覆写 hashCode() AND 相同的 key.hashCode() 相等
             * 否则，无法根据相同的 key 找到唯一的下标
             */
            int hash = key.hashCode();

            /**
             * 这个的作用的是让 hash 中的每一位都参与到找下标中
             * 使得找到的下标，尽可能均匀
             */
            hash = (hash >>> 16) ^ hash;

            // 1.2 利用 hash 得到合法的下标
            /**
             * 前提：这里利用 table.length 一定是 2 的幂次方 这个特点
             * 利用位运算思考，为什么这么计算之后，得到的下标就是合法的
             */
            index = hash & (table.length - 1);
        }

        // 2. 使用下标，找到链表的头结点的引用
        Entry<K, V> head = table[index];

        // 3. 在链表中，找到包含 key 的结点，返回存在结点中的 value
        //    即和 key 关联的 value
        // 方法就是遍历链表，去找
        Entry<K, V> node = head;
        while (node != null) {
            /**
             * 这里使用了 key 的 equals 方法 ->
             * 如果使用自定义类作为 HashMap 的key
             * 必须覆写类的 equals 方法，保证你认为相同的 key，equals 返回true
             * 否则，无法正确找到 value
             */
            if (key == null && node.key == null) {
                V oldValue = node.value;
                node.value = value;
                return oldValue;
            }
            if (key.equals(node.key)) {
                // 使用新的 value，替换原来的 value
                // 并且返回原来的 value
                V oldValue = node.value;
                node.value = value;
                return oldValue;
            }

            node = node.next;
        }

        // 链表遍历结束了，没有找到
        // 使用 key-value 新建结点，并且把结点插入到链表中
        Entry<K, V> entry = new Entry<>(key, value);
        // 要把结点插入到链表中
        // 两种方式：头插 OR 尾插
        // 如果不考虑多线程情况，其实头插比较简单
        // 如果考虑多线程情况，头插可能会产生一些问题，所以 1.8 之后使用了尾插
        // 我们选择使用尾插
        if (head == null) {
            table[index] = entry;
        } else {
            Entry<K, V> last = head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = entry;
        }

        size++;
        // 为了减少冲突率，所以需要考虑降低 size / table.length 的值
        // 设定一个阈值，当 size / table.length 高于某个值时，进行扩容
        // 所谓的扩容，就是保证 size 不变，让 table.length 变大
        // 进而,使得 size / table.length 降低,进而减少冲突率
        if (size * 1.0 / table.length > LOADER_FACTOR_THRESHOLD) {
            resize();
        }

        return null;
    }

    /**
     * 所谓的扩容,需要
     * 1. 保证 table.length 仍然是 2 的幂次方
     * 2. 因为 table.length 变化了,所以 key 对象的下标一定会变化
     *    所以,需要把所有的 key,重新计算下标,重新插入
     */
    private void resize() {
        // 长度 * 2,保持了 2 的幂次方
        Entry<K, V>[] newTable = new Entry[table.length * 2];

        // 遍历原来的所有的链表(遍历数组)
        for (int i = 0; i < table.length; i++) {
            Entry<K, V> head = table[i];
            // head 是一条条链表的头结点的引用
            // 遍历链表中的每一个结点,把 key-value 重新插入新的 newTable 中
            Entry<K, V> node = head;
            while (node != null) {
                K key = node.key;
                V value = node.value;

                // 利用 key,求新的下标
                int hash = key.hashCode();
                hash = (hash >>> 16) ^ hash;
                int index = hash & (newTable.length - 1);

                // 这次直接头插
                Entry<K, V> entry = new Entry<>(key, value);
                entry.next = newTable[index];
                newTable[index] = entry;

                node = node.next;
            }
        }

        // 原来的 table 不要了,使用 newTable 替换掉原来的 table
        table = newTable;
    }
}
