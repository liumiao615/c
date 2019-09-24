//冒泡排序：减治算法

import java.util.Arrays;
public class Sort{
	public static void main(String[] args){
		int[]a={3,5,7,1,2};
		int[]b={2,4,1,9,4};
		int[]c={3,3,3,3,3};
		print(a);
		print(b);
		print(c);
		System.out.println(average(new int[]{1,2,3,4,5,6,7}));
	}
	public static void swap(int[]a,int i,int j)
	{
		int x=a[i];
		a[i]=a[j];
		a[j]=x;
	}
	public static void bubbleSort(int[]a){
		for(int i=0;i<a.length;i++){
			boolean sored = true;
			/* for(int j=1;j<a.length-i;j++){
				 if(a[j-1]>a[j]){
					 swap(a,j-1,j);
				 }
			 } */
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1]){
					swap(a,j,j+1);
					sored=false;
				}
			}
			if(sored == true)
			return;
		}
	}
	public static void  print(int[]a){
		bubbleSort(a);
		System.out.println(Arrays.toString(a));
	}
	public static double average(int[] a){
		/* int x=0;
		bubbleSort(a);
		for(int i=1;i<a.length-1;i++)
		{
			x+=a[i];
		}
		double average=x/(a.length-2);
		return average; */
		int sum=0;
		int max=a[0];
		int min=a[0];;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
			if(a[i]>max)
				max=a[i];
			if(a[i]<min)
				min=a[i];
			
		}
		return(double)(sum-max-min)/(a.length-2);
	}
}
	
	