package L0513;

public class Synchronized语法练习 {
    static Object o1 = new Object();
    static void method1(){
        Object o2 = o1;
        synchronized (o2){

        }
    }
    static void method2(){
        Object o3 = o1;
        synchronized (o3){

        }
    }
}
