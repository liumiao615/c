public class Solution {
    public static void main(String[] args) {
        int[] a={3,4,8,12,3,2,9,0,5,7};
        System.out.println("排序前数组为：");
        for(int k:a){
            System.out.print(k+" ");
        }
        for(int i =0;i < a.length;i++){
            for(int j = i + 1;j < a.length;j++){
                if(a[i] < a[j]){
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        System.out.printf("\n");
        System.out.println("排序后数组：");
        for(int k:a){
            System.out.print(k+" ");
        }

    }
}
