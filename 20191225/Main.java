package about_files;

import java.io.*;

public class Main {
    //private static void listDir(File dir) throws IOException {
//        File[] files = dir.listFiles();
//        for(File f:files){
//            if(f.isDirectory()){
//                listDir(f);
//            }else {
//                System.out.println(f.getAbsoluteFile() + ":" + f.length());
//            }
//        }
    //}
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\程序\\java idea\\2019-12-21IO\\新目录\\测试\\测试文件");
//        file.createNewFile();
//        OutputStream os = new FileOutputStream(file);
//        os.write('A');
//        os.write('C');
//
//        byte[] bytes = "我是吴世勋".getBytes("UTF-8");
//        os.write(bytes);
        file.createNewFile();
        OutputStream os = new FileOutputStream(file);


        /*InputStream is = new FileInputStream(file);
        System.out.println(is.available());
        int c;
        while((c = is.read())!= -1){
            System.out.println(c);
        }
        for(int i = 0;i < 17;i++){
            int b = is.read();
            System.out.println(b);
        */


        //listDir(new File("D:\\报告类"));
        //File file = new File("D:\\报告类");
//        if(file.exists() && file.isDirectory()){
//            File[] files = file.listFiles();
//            for(File F:files){
//                System.out.println(F);
//            }
//        }
        //ListAllFile(file);
//        File[] files = File.listRoots();
//        for(File f:files){
//            System.out.println(f);
//            System.out.println(f.exists());
//        }
//        File file= File.createTempFile("iodem","end");
//        System.out.println(file.getAbsoluteFile());
        
//        String Parent = "D:\\程序\\java idea\\2019-12-21IO\\测试目录";
//        File file = new File(Parent);
//        String destPath = "D:\\程序\\java idea\\2019-12-21IO\\新目录";
//        File dest = new File(destPath);
//        file.renameTo(dest);

//        file.mkdirs();
//        file.deleteOnExit();
//        file.createNewFile();
//        file.delete();
//        file.deleteOnExit();
//        String Path = "D:\\程序\\java idea\\2019-12-21IO";
//        //String Parent = "D:\\程序\\java idea\\2019-12-21IO\\测试目录";
//        File file = new File(Path);
//        File[] files = file.listFiles();//将文件下的所有文件打印出来
//        for(File f:files){
//            System.out.println(f);
//        }

//        File file = new File(Parent);
//        System.out.println(file.isHidden());//是否是隐藏文件
//        file.length();

        //File file = new File("D:\\程序\\java idea\\2019-12-21IO\\测试目录");
//        System.out.println(file.exists());
//        System.out.println(file.isDirectory());
//        System.out.println(file.getFreeSpace());
//        System.out.println(file.getUsableSpace());
//        System.out.println(file.getTotalSpace());
//        System.out.println(file.getAbsoluteFile());
//        System.out.println(file.getParent());
//        System.out.println(file.canRead());
//        System.out.println(file.canWrite());
//        System.out.println(file.canExecute());
    }

//    private static void ListAllFile(File file) {
//        if(file.isDirectory()){
//            File[] r = file.listFiles();
//            if(r != null){
//                for(File F:r){
//                    ListAllFile(F);
//                }
//            }
//        }else {
//            System.out.println(file);
//        }
//    }
}
