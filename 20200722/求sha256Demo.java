package lab;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class 求sha256Demo {
    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        //md5
        //SHA-256
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        String S = "吴世勋";
        byte[] bytes = S.getBytes("UTF-8");
        messageDigest.update(bytes);
        byte[] result = messageDigest.digest();
        System.out.println(result.length);
        for(byte b:result) {
            System.out.printf("%02x", b);
            //一个字符一个字符打印出来
        }
    }
}
