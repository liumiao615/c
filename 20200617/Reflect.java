package L0617反射;

import java.lang.reflect.Field;

class Person1{
    private String name;
    public Person1(String name){
        this.name = name;
    }

    public String GetName(){
        return this.name;
    }
}
public class Reflect {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Person1 p  = new Person1("xiao ming");
        System.out.println(p.GetName());
        Class cls = p.getClass();
        Field f = cls.getDeclaredField("name");
        f.setAccessible(true);
        f.set(p,"xiao hong");
        System.out.println(p.GetName());
    }
}
