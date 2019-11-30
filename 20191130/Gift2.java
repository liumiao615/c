public class Gift2 {
    public static int getValue(int[] gifts,int n){
        int ans = gifts[n/2];
        int num = 0;
        for(int i = 0;i < gifts.length;i++){
            if(gifts[i] == ans){
                num++;
            }
        }
        return num <= n/2 ? 0:ans;
    }

    public static void main(String[] args) {
        int[] A = {1,2,3,2,2};
        System.out.println(getValue(A,A.length));
    }
}
