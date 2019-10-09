import java.util.Comparator;

public class Compare implements Comparator<Compare> {
    public int age;
    public String name;
    public int height;
    public double weight;


    @Override
    public int compare(Compare o1, Compare o2) {
        if(o1.height < o2.height){
            return -1;
        }else if(o1.height > o2.height){
            return 1;
        }
        if(o1.weight < o2.weight){
            return -1;
        }else if(o1.weight > o2.weight){
            return 1;
        }
        int r = o1.name.compareTo(o2.name);
        if(r!=0){
            return r;
        }
        return o1.age - o2.age;
    }

    public static void main(String[] args) {
        Compare s = new Compare();
        s.age = 21;s.height = 190;
        s.weight = 200.0;s.name = "ssy";
        Compare l = new Compare();
        l.age = 22;l.weight = 57.5;
        s.height = 164;s.name = "lm";

        Comparator<Compare> a = new Compare();
        int t = a.compare(s,l);
        if(t > 0){
            System.out.println("s>l");
        }else if(t == 0){
            System.out.println("s==l");
        }else {
            System.out.println("s<l");
        }
    }
}
