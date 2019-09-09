public class ArrayList{
	private int[] array;
	private int size;
	//创建新数组
	public ArrayList(){
		array = new int[2];
		size=0;
	}
	//尾插
	public void pushBack(int element){
		ensureCapacity();
		array[size++]=element;
	}	
	//前插
	public void pushFront(int element){
		ensureCapacity();
		for(int i=size;i>0;i--){
			array[i]=array[i-1];
		}
		array[0]=element;
		size++;
	}
	//插入
	public void insert(int index,int element){
		if(index<0||index>size){
			System.err.println("下标错误");
			return ;
		}
		ensureCapacity();
		for(int i=size;i>index;i--){
			array[i]=array[i-1];
		}
		array[index]=element;
		size++;
	}
	//尾删
	public void popBack(){
		if(size<=0){
			System.out.println("顺序表为空");
			return;
		}
		
		array[--size]=0;
	}
	//头删
	public void popFront(){
		if(size<=0){
			System.out.println("顺序表为空");
			return;
		}
		for(int i=0;i<size-1;i++){
			array[i]=array[i+1];
		}
		array[--size]=0;
	}
	//删除
	public void earse(int index){
		if (size <= 0) {
			System.err.println("顺序表为空");
			return;
		}
		
		if (index < 0 || index >= size) {
			System.err.println("下标错误");
			return;
		}
		for(int i=index;i<size-1;i++){
			array[i]=array[i+1];
		}
		array[--size]=0;
	}
	//打印
	public void print(){
		System.out.println("打印顺序表: 当前容量: " + array.length);
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	//保证容量够用，否则扩容。
	private void ensureCapacity(){	
	if(size<array.length){
		return;
	}
	int newCapacity=array.length*2;
	int[]newArray=new int[newCapacity];
	for(int i=0;i<size;i++){
		newArray[i]=array[i];
	}
	array=newArray;
	}
	public static void main(String[] args){
		ArrayList list=new ArrayList();
		
		list.print();
		list.pushBack(1);
		list.pushBack(2);
		list.pushBack(3);
		list.print();	// 1 2 3
		list.pushFront(10);
		list.pushFront(20);
		list.pushFront(30);
		list.print();	// 30 20 10 1 2 3
		list.insert(3, 100);
		list.print();	// 30 20 10 100 1 2 3
		list.insert(20, 200);	// 报错
		
		list.earse(2);
		list.earse(2);
		list.print();	// 30 20 1 2 3
		list.popFront();
		list.popFront();
		list.popFront();
		list.print();	// 2 3
		list.popBack();
		list.popBack();
		list.print();	// 空的
		list.popBack();	// 报错
	}
		
		
}
