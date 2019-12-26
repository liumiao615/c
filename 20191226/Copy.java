package about_streams;

import java.io.*;

public class Copy {
    public static void main(String[] args) throws IOException {
        String src = "E:\\比特科技\\课程\\JavaWeb\\Java11班\\2019-11-29-文件IO\\测试目录\\测试文件.txt";
        String dest = "E:\\比特科技\\课程\\JavaWeb\\Java11班\\2019-11-29-文件IO\\测试目录\\目标文件.txt";

        InputStream is = new FileInputStream(src);
        OutputStream os = new FileOutputStream(dest);
        int b;
        while ((b = is.read()) != -1) {
            os.write(b);
        }
    }
}
