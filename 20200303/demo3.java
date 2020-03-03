public interface demo3 {
    public void nameA();
}
interface BB{
    public void nameB();
}
interface C extends demo3,BB{
    public void nameC();
}
class demo implements demo3,BB,{
    public void nameA(){
        System.out.println("A");
    }
    public void nameB(){
        System.out.println("B");
    }
    public void nameC(){
        System.out.println("C");
    }

    public static void main(String[] args) {
        demo a = new demo();
        a.nameA();
        a.nameB();
        a.nameC();
    }
}
