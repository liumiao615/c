import java.io.File;

public class ListDir {
    public static void ListDir(File dir){
        File[] files = dir.listFiles();
        for(File file:files){
            if(file.isDirectory()){
                ListDir(file);
            }else {
                System.out.println(file.getAbsoluteFile());
            }
        }
    }
    public static void main(String[] args) {
        ListDir(new File("D:\\程序"));
    }
}
