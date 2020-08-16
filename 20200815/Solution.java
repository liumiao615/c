import java.util.*;
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if(k > input.length || k <= 0 || input == null){
            return list;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>(k,Collections.reverseOrder());
        for(int i = 0;i < input.length;i++){
            if(i < k){
                queue.offer(input[i]);
            }else{
                if(input[i] < queue.peek()){
                    queue.poll();
                    queue.offer(input[i]);
                }
            }
        }
        for(int i = 0;i < k;i++){
            list.add(queue.poll());
        }
        return list;
    }
}