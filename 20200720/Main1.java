public class Solution{
	
	public boolean Find(int target,int[][]array){
			if(array == null){
				return false;
			}
			int i = 0;
			int j = array[0].length - 1;
			while(i < array.length && j>= 0){
				if(target < array[i][j]){
					j--;
				}else if(target > array[i][j]){
					i++;
				}else{
					return true;
			}
		}
		return false;
	}
}