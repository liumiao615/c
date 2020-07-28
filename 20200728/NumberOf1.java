package J0728;

public class NumberOf1 {
    public static int numberOf1(int n) {
        //考虑负数
        int i = 0;
        while(n != 1){
            n = n & (n-1);
            i++;
        }
        return i;
    }
    public static void main(String[] args) {
        System.out.println(numberOf1(63));
    }
}
