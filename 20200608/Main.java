import java.io.UnsupportedEncodingException;
import java.util.Arrays;
public class Main{
    public static void main(String[] argd){
        byte[]bs = toGBK("中文");
        System.out.println(Arrays.toString(bs));
    }
    static byte[] toGBK(String s){
        try{
            return s.getBytes("GBK");
        }catch(UnsupportedEncodingException e){
            System.out.println(e);
            return s.getBytes();
        }
    }
}


	static byte[] toGBK(String s) {
    try {
        return s.getBytes("GBK");
    } catch (UnsupportedEncodingException e) {
        // 什么也不干
    }
    return null;
	
	
	
	static byte[] toGBK(String s) {
    try {
        return s.getBytes("GBK");
    } catch (UnsupportedEncodingException e) {
        // 先记下来再说:
        e.printStackTrace();
    }
    return null;
	//所有异常都可以调用printStackTrace()方法打印异常栈，
	//这是一个简单有用的快速打印异常的方法。