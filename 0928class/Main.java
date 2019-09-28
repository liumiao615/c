import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("9787201151304", "从一到无穷大", "[美] 乔治·伽莫夫", 1600, 400, 26));

        List<Book> copy;

        // 按自然顺序（ISBN）排序
        System.out.println("按 ISBN 排序：");
        copy = new ArrayList<>(books);
        Sort.sort(copy);
        System.out.println(copy);

        // 按书名排序
        System.out.println("按 书名 排序：");
        copy = new ArrayList<>(books);
        Sort.sort(copy, new TitleComparator());
        System.out.println(copy);

        // 按价格排序-从小到大
        System.out.println("按 价格-从小到大 排序：");
        copy = new ArrayList<>(books);
        Sort.sort(copy, new PriceComparator(true));
        System.out.println(copy);

        // 按价格排序-从大到小
        System.out.println("按 价格-从大到小 排序：");
        copy = new ArrayList<>(books);
        Sort.sort(copy, new PriceComparator(false));
        System.out.println(copy);
    }
}
