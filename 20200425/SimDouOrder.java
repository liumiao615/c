import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SimDouOrder {
    public static void Find(int[] arr){
        int nums[] = new int[2];
        int j =  0;
        Map<Integer,Integer> map = new HashMap();
        for(int i = 0;i < arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        System.out.println(map);
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue() % 2 == 1){
                nums[j++] = e.getKey();
            }
        }

        Arrays.sort(nums);

        System.out.println(nums[0] + " " + nums[1]);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] arr = new int[count];
        for(int j = 0;j < count;j++){
            arr[j] = sc.nextInt();
        }
        Find(arr);
    }

}
