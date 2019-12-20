import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FromTermailToFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        File file = new File("输出.txt");
        FileWriter fileWriter = new FileWriter(file);
        while (scanner.hasNext()) {
            String s = scanner.next();
            for (int i = 0; i < s.length(); i++) {
                fileWriter.append(s.charAt(i));
                fileWriter.flush();
            }
        }
        fileWriter.close();
    }
}
