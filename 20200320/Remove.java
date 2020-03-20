import java.util.*;
public class Remove {
    public static void Remove(String S1,String S2){

        //数组下标越界
//        char[]arr1 = S1.toCharArray();
//        char[]arr2 = S2.toCharArray();
//        StringBuffer sb = new StringBuffer();
//        int i = 0;
//        int j = 0;
//
//        while(i < arr1.length) {
//            if (arr1[i] == arr2[j]) {
//                    i += 1;
//                    j = 0;
//                } else {
//                    j += 1;
//                    if (j == arr2.length - 1 && arr1[i] != arr2[j]) {
//                        sb.append(arr1[i]);
//                        i+=1;
//                        j = 0;
//                    }
//                }
//            }
//        System.out.println(sb);
        char[] arr = new char[S1.length()];
        int index = 0;
        for(int i = 0;i < arr.length;i++){
            if(!S2.contains(S1.charAt(i) + "")){
                arr[index++] = S1.charAt(i);
            }
        }
      //  System.out.println(Arrays.toString(arr));
        System.out.println(String.valueOf(arr).trim());
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
//        String S1 = scanner.nextLine();
//        String S2 = scanner.nextLine();
        String S1 = "uThey are studentsuu";
        String S2 = "aeiou";

        Remove(S1,S2);
    }
}
