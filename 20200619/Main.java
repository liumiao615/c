import java.util.List;

////用迭代器的方法遍历list
public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("apple", "pear", "banana");
			for(Iterator<String> it = list.iterator();it.hasNext()){
				String s = it.next();
				System.out.println(s);
			}
        }
    }
}