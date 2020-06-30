//1，创建单元素集合.singletonList 
//List<String> list2 = Collections.singletonList("apple");

//2，创建不可变元素集合.unmodifitableList
public class Main {
    public static void main(String[] args) {
        List<String> mutable = new ArrayList<>();
        mutable.add("apple");
        mutable.add("pear");
        // 变为不可变集合:
        List<String> immutable = Collections.unmodifiableList(mutable);
		   //对原始的可变List进行增删是可以的，并且，会直接影响到封装后的“不可变”List：
           //immutable.add("orange"); // UnsupportedOperationException!
		mutable.add("orange");//[apple, pear, orange] 
		mutable = null;
        System.out.println(immutable);
    }
}
//如果我们希望把一个可变List封装成不可变List，那么，返回不可变List后，最好立刻扔掉可变List的引用，
//这样可以保证后续操作不会意外改变原始对象，从而造成“不可变”List变化了：

//3，创建空集合
//List<String> list1 = List.of();
//List<String> list2 = Collections.emptyList();