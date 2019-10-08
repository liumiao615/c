import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main{

    public static void main(String[] args) {
        List<Lib> books = new ArrayList<>();
        books.add(new Lib("9787201151304", "从一到无穷大", "[美] 乔治·伽莫夫", 1600, 400, 26));
        books.add(new Lib("9787020147465", "应物兄", "李洱", 7900, 1668, 300));
        books.add(new Lib("9787220107085", "如何写甲骨文", "日本文字文化机构", 8800, 23, 6));
        books.add(new Lib("9787521706635", "敌人与邻居", "[英]伊恩·布莱克", 10800, 3, 0));
        books.add(new Lib("9787301280751", "法国大革命 (第2版)", "布兰宁(T.C.W.Blanning)", 4500, 1993, 188));
        List<Lib> copy;
        //按自然顺序（）ISBN
        System.out.println("按 ISBN 排序：");
        copy = new ArrayList<>(books);
        Sort.sort(copy);
        System.out.println(copy);

        // 按书名排序
        System.out.println("按 书名 排序：");
        copy = new ArrayList<>(books);
        Sort.sort(copy, new Solution());
        System.out.println(copy);

        // 按价格排序-从小到大
        System.out.println("按 价格-从小到大 排序：");
        copy = new ArrayList<>(books);
        Sort.sort(copy, new price(true));
        System.out.println(copy);

        // 按价格排序-从大到小
        System.out.println("按 价格-从大到小 排序：");
        copy = new ArrayList<>(books);
        Sort.sort(copy, new price(false));
        System.out.println(copy);


    }
}
