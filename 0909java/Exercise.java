public class Exercise{
	public static void main(String[] args){
		int []a={1,2,3,4,5};
		int n=5;
		System.out.println();
	}
	// public static int find(int[] a,int n)
	// {
		// for(int i=0;i<a.length;i++){
			// if(a[0]==n){
				// return 1;
			// }
		// }
		// return -1;
		//}
	public static int binarySearch(int[]a,int v)
	{
		int left=0;
		int right=a.length-1;
		while(left<=right)
		{
			int mid=(left+right)/2;
			if(v==a[mid])
			{
				return mid;
			}
			else if(v>a[mid])
			{
				left=mid+1;			
			}
			else if(v<a[mid])
			{
				right=mid-1;
			}
		}
		return -1;
	}
}