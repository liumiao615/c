/**
 * 想象成链表的结点 Node 类
 * 之所以叫 Entry，是因为真实中的 HashMap 就叫 Entry
 * @param <K>
 * @param <V>
 */
public class Entry<K, V> {
    K key;
    V value;

    Entry<K, V> next = null;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
