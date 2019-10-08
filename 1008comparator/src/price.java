import java.util.Comparator;

public class price implements Comparator<Lib> {
    //true 代表从小到大
    //false代表从大到小
    boolean asc;
    public price(boolean asc){
        this.asc = asc;
    }
    @Override
    public int compare(Lib o1, Lib o2) {
        if(asc){
            return o1.price - o2.price;
        }else {
            return o2.price - o1.price;
        }
    }
}
