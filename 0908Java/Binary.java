public class Binary{
	public static void main(string[] args){
		
	}
}
/* public static int  binarySearch(int[]a,int v){
	    
		int left=0;
		int right=a.length-1;
		
		while(left<=right){
			int mid=(left+right)/2;
			if(a[left]=a[right]){
				return mid;
			}
			else if(v<a[mid]){
				right=mid-1;
			}
			else{left=mid+1;}
				
		}
		return -1;
} */
public void pushBack(int element){
	array[size++]=elememt;
}
public void pushFront(int element){
	for(int i=size;i>=1;i--){
		array[i]=a[i-1];
	}
	array[0]=elememt;
	size++;
}
void insert(int index,int e){
	for(int i=size-1;i>=index;i--){
		array[i+1]=array[i];
	}
	array[index]=e;
	size++;
}
public void popFront(){
	for(int i=0;i<=size-2;i++)
	{
		array[i]=array[i+1];
	}
	array[--size]=0;
}
public void earse(int index){
	
}


 










