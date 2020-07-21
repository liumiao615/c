import java.util *;
public class Solution{
	public int minNumber(int[] array){
		if(array == null || array.length == 0){
			return 0;
		}
		for(int i = 0;i < array.length-1;i++){
			if(array[i] > array[i+1]){
				return array[i+1];
			}
		}
		return array[0];
	}
}