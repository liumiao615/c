import java.util.Comparator;

public class comparable {
    class Comparators implements Comparator<person>{

        @Override
        public int compare(person o1, person o2) {
            if(o1.height<o2.height){
                return -1;
            }else if(o1.height<o2.height){
                return 1;
            }
            return 0;
        }
    }
    class HeightComparator implements Comparator<person>{

        @Override
        public int compare(person o1, person o2) {
            return o1.height-o2.height;
        }
    }
    class personNameComparator implements Comparator<person>{

        @Override
        public int compare(person o1, person o2) {
            return o1.name.compareTo(o2.name);
        }
    }

    public class person implements Comparable<person>{
        String name;
        int age;
        int height;
        int weight;

        @Override
        public int compareTo(person o) {
            return age-o.age;

        }

        public void main(String[] args) {
            person p = new person();
            p.age = 20;
            p.name = "AAAAA";
            p.height = 160;
            p.weight = 110;
            person q = new person();
            q.age = 9;
            q.name = "Dcf";
            q.height = 180;
            q.weight = 120;

            int r = p.compareTo(q);
            // System.out.println("abc",CompareTo("abcd"));
            Comparator<person> comparator = new personNameComparator();
            int s = comparator.compare(p, q);
            if (s < 0) {
                System.out.println("<");
            } else if (s == 0) {
                System.out.println("=");
            } else {
                System.out.println(">");
            }

            Comparator<person> comparator1 = new HeightComparator();
            int e = comparator1.compare(p, q);
            if (e < 0) {
                System.out.println("p<q");
            } else if (e == 0) {
                System.out.println("=");
            } else {
                System.out.println("p>q");
            }

            Comparator<person> comparator2=new Comparators();

        }
    }
}
