public class Test {
    public static void main(String[] args) {
        int A = 3;
        //int B = A ^ 3;
        int B = (int) Math.pow(3,3);
        System.out.println(B);
    }
    public static String GetSequeOddNum(int m) {
        //int B = (int) Math.pow(m, 3);
        int[] a = new int[10000];
        a[0] = 1;
        for(int i = 0;i < a.length;i++){
            a[i] = 2 * i + 1;
        }
        int sum = 0;
        for(int j = 1;j < m;j++){
            sum += j;
        }
        int[] b = new int[m];
        int j = 0;
        for(int i = sum;i < sum + m;i++){
            b[j] = a[i];
            j++;
        }
        String s = "";
        int i = 0;
        while(i < b.length){
            if(i != b.length - 1){
                s += b[i] + " + ";
            }else {
                s += b[i];
            }
            i++;
        }
        return s;
    }
}
