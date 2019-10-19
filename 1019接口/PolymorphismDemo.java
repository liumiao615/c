class A {
    public void method() {
        System.out.println("A 的普通方法");
    }

    public static void staticMethod() {
        System.out.println("A 的静态方法");
    }
}

class B extends A {
    @Override
    public void method() {
        System.out.println("B 的普通方法");
    }

    public static void staticMethod() {
        System.out.println("B 的静态方法");
    }

    public void methodOfB() {
        System.out.println("只有 B 有的方法");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        A aa = new A();
        A ab = new B();
        B bb = new B();
        // B ba = new A(); 编译错误

        aa.method();
        // aa.methodOfB(); 编译错误
        ab.method();
        // ab.methodOfB(); 编译错误
        bb.method();
        bb.methodOfB();

        System.out.println("=============");

        // 警告，永远不要这么写
        aa.staticMethod();
        ab.staticMethod();
        bb.staticMethod();

        System.out.println("=============");
        // 向下类型转化
        if (ab instanceof B) {
            B b = (B) ab;
            b.methodOfB();
        }

        if (aa instanceof B) {
            B c = (B) aa;
            c.methodOfB();
        }
    }
}
