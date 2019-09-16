import java.util.LinkedList;

public class Review {
    public static void main(String[] args) {
        LinkedList<String> LinkedList=new LinkedList();
        LinkedList.addFirst("sunsy");
        LinkedList.addFirst("like");
        LinkedList.addFirst("lium");
        LinkedList.remove();
        LinkedList.removeFirst();
        LinkedList.pollFirst();
        System.out.println(LinkedList);

        System.out.println(LinkedList.peekFirst());

    }
}
