//给你一个正整数的数组 A（其中的元素不一定完全不同），请你返回可在 一次交换
// （交换两数字 A[i] 和 A[j] 的位置）后得到的、按字典序排列小于 A 的最大可能排列。
//如果无法这么操作，就请返回原数组。



class exchande{
//    @Override
//    public String toString(){
//        return String.format("%d");
//    }
    public  int[] prevPermOpt1(int[] A) {

        for(int i = A.length - 2; i>=0; i--){
            if(A[i] > A[i+1]){
                int tmp_i = i+1;
                for(int j = i+1; j<A.length; j++){
                    if(A[j] < A[i] && A[j] > A[tmp_i]){
                        tmp_i = j;
                    }
                }
                int tmp = A[tmp_i];
                A[tmp_i] = A[i];
                A[i] = tmp;
                return A;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int []array={9,4,3,8,2,3,4,5,6,7,7,8};
        //int []a=prevPermOpt1(array);
        exchande b=new exchande();
        int[]a=b.prevPermOpt1(array);
//        for (int i : a) {
//            System.out.println(i);
//        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
