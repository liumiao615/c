import java.util.Comparator;
class heightComparator implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
         return (int) (o1.height -o2.height);
    }
}
class personNameComparator implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        return o1.name.compareTo(o2.name);
    }
}
public class Person implements Comparable<Person>{
    public String name;
    public int age;
    public double height;

    @Override
    public int compareTo(Person o) {
        return age-o.age;

//        if(age < o.age){
//            return -1;
//        }else if(age == o.age){
//            return 0;
//        }else {
//            return 1;
//        }
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.name = "jame";p.age = 18;p.height=180;
        Person q = new Person();
        q.name = "lium" ;q.age = 21;q.height=165;
        int r = p.compareTo(q);
        if(r > 0){
            System.out.println("p>q");
        }else if(r==0){
            System.out.println("p=q");
        }else {
            System.out.println("p<q");
        }
        System.out.println("abc".compareTo("bbc"));
        System.out.println("abcd".compareTo("abc"));

        Comparator<Person> comparator = new personNameComparator();
        System.out.println("按姓名比较：");
        int t = comparator.compare(p,q);
        if(t > 0){
            System.out.println("p>q");
        }else if(t==0){
            System.out.println("p=q");
        }else {
            System.out.println("p<q");
        }
        Comparator<Person> heightc = new heightComparator();
        System.out.println("基于身高的比较：");
        int k = heightc.compare(p,q);
        if(k > 0){
            System.out.println("p>q");
        }else if(k==0){
            System.out.println("p=q");
        }else {
            System.out.println("p<q");
        }
    }

}
