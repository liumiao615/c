public class Add{
    public static int addAB(int A, int B) {
        // write code here
        while(B != 0){
            int m = A ^ B;
            int n = (A & B) << 1;
            A = m;
            B = n;
        }
        return A;
    }

    public static void main(String[] args) {
        int A = 1;
        int B = 3;
        System.out.println(addAB(A,B));
    }
}
