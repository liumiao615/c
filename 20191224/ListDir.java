package about_files;

import java.io.File;

public class ListDir {
    public static void listDir(File dir) {
        File[] files = dir.listFiles();
        if (files == null) {
            System.out.println(dir.canExecute());
            System.out.println(dir.canWrite());
            System.out.println(dir.canRead());
            System.out.println(dir.isDirectory());
        }
        for (File file : files) {
            if (file.isDirectory()) {
                listDir(file);
            } else {
                //System.out.println(file.getAbsolutePath() + ": " + file.length());
            }
        }
    }
    public static void main(String[] args) {
        listDir(new File("D:\\"));
    }
}
