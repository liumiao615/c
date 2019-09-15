import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> courses=new ArrayList<>();
        courses.add("c 语言");
        courses.add("java se");
        courses.add("java web");
        courses.add("java EE");
        courses.add("java web");
        System.out.println(courses);
        System.out.println(courses.get(0));
        System.out.println(courses);

    }
}
