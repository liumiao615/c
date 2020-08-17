public class Solution {
	public int FindGreatestSumOfSubArray(int[] array) {
	int total = array[0];
	int max_value = array[0];
	//for 循环，用来检测以i下标结尾的连续子序列的和
	for(int i = 1; i < array.length; i++){
		if(total >= 0){
		//如果之前total累计的和>=0,说明当前数据+total，有利于整体增大
			total += array[i];
		}else{
		//如果之前累计的和<0,说明当前数据+total，不利于整体增大,丢弃之前的所有值
		//这里有一个基本事实，就是之前的连续数据和是确定的。
		//连续，是可以从以前到现在，也可以是从现在到以后。至于要不要加以前，就看以前对整体增大又没有
		
			total = array[i];
		} 
		if(max_value < total){
			max_value = total;
			}
		}
	}
}