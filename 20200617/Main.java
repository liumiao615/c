package L0617反射;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class Person{
    public String name;
}
class Student extends Person{
    public int score;
    private int grade;
}
public class Main {
    public static void main(String[] args) throws NoSuchFieldException {
        Class cls = Student.class;
//        System.out.println(cls.getField("name"));
//        System.out.println(cls.getField("score"));
//        System.out.println(cls.getFields());
//        System.out.println(cls.getDeclaredField("grade"));
//        System.out.println(cls.getDeclaredFields());
        Field f = cls.getDeclaredField("grade");
        System.out.println(f.getName());
        System.out.println(f.getType());
        int m = f.getModifiers();
        Modifier.isFinal(m);
        Modifier.isPublic(m);
        System.out.println(Modifier.isPrivate(m));
        Modifier.isProtected(m);
        Modifier.isStatic(m);
    }
}
