package L0617反射;


import java.lang.reflect.Constructor;

public class Method2 {
    public static void main(String[] args) throws Exception {
        Constructor cons1 = Integer.class.getConstructor(int.class);
        Integer I1 = (Integer) cons1.newInstance(123);
        System.out.println(I1);

        Constructor cons2 = Integer.class.getConstructor(String.class);
        Integer I2 = (Integer)cons2.newInstance("34");
        System.out.println(I2);
    }
}
