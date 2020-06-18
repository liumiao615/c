package L0617反射;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static javax.swing.text.html.HTML.Tag.P;

//用反射来调用方法
public class Method1 {
    //调用普通方法
//    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//        String s = "Hello Word";
//        // 获取String substring(int)方法，参数为int:
//        Method m = String.class.getMethod("substring", int.class);
//        String e = (String) m.invoke(s,6);
//        System.out.println(e);
//    }


    //调用静态方法
    //调用静态方法时，由于无需指定实例对象，所以invoke方法传入的第一个参数永远为null。
    // 我们以Integer.parseInt(String)为例：
//    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//        Method m = Integer.class.getMethod("parseInt", String.class);
//        Integer n = (Integer) m.invoke(null,"123");
//        System.out.println(n);
//    }

    //调用非public方法
    public static void main(String[] args)throws Exception {
        Person2 p = new Person2();
        Method m = p.getClass().getDeclaredMethod("setName", String.class);
        m.setAccessible(true);
        m.invoke(p, "Bob");
        System.out.println(p.name);
    }

}
class Person2{
    String name;
    private void setName(String name) {
        this.name = name;
    }
}