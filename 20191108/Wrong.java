public class Wrong {
    public int i;
    static String s;
    void method1(){}
    static void method2(){}

    public static void main(String[] args) {
        Wrong a = new Wrong();
        System.out.println(a.i);
        a.method1();
        Wrong.method2();
    }
}
