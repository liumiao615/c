class  A{
    public void voice(){
        System.out.println("A的voice方法");
    }
    public static void mathod(){
        System.out.println("A的静态方法");
    }
}
public class extendDemo extends A{
    @Override
    public void voice(){
        System.out.println("B的voice方法");
    }

    public static void mathod(){
        System.out.println("B的静态方法");
    }
    public static void main(String[] args) {
        A a = new A();
        A aa = new extendDemo();
        extendDemo b = new extendDemo();
        a.voice();
        aa.voice();
        b.voice();
        A.mathod();
        aa.mathod();
        b.mathod();
    }
}
