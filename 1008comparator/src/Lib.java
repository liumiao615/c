import java.util.Objects;

public class Lib implements Comparable<Lib>{
    public String ISBN;
    public String author;
    public String title;
    public int price;
    public int sales;
    public int comments;

    public Lib(String ISBN, String author, String title, int price, int sales, int comments) {
        this.ISBN = ISBN;
        this.author = author;
        this.title = title;
        this.price = price;
        this.sales = sales;
        this.comments = comments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lib lib = (Lib) o;
        return price == lib.price &&
                sales == lib.sales &&
                comments == lib.comments &&
                Objects.equals(ISBN, lib.ISBN) &&
                Objects.equals(author, lib.author) &&
                Objects.equals(title, lib.title);
    }



    @Override
    public String toString() {
        return "Lib{" +
                "ISBN='" + ISBN + '\'' +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", sales=" + sales +
                ", comments=" + comments +
                '}';
    }

    @Override
    public int compareTo(Lib o) {
        return ISBN.compareTo(o.ISBN);
    }


}
