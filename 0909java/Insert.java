class Node{
	int val;
	Node prev=null;//指向前驱结点，第一个结点的prev==null；
	Node next=null;//指向后驱结点，最后一个结点的next==null;
	
    public Node(int val){
	this.val=val;
    }
}
public class Insert{
	private Node head=null;
	private Node last=null;
	private int size=0;
	//头插
	public void pushFront(int val){
		Node node=new Node(val);
		node.next=head;
		if(head!=null){
		head.prev=node;}
		else{
			head=node;
		}
		size++;
	}
	//头删
	public void popFront(){
		if(size<=0){
			System.out.println("空链表不能被删除");
			return;
		}		
			if(head!=null){
				head.prev=null;
				head=head.next;
			}
			else{
				
				last=null;
			}
		size--;
	}
	//尾插
	public void pushBack(int val){
		Node node =new Node(val);
		if(last==null){
			head=node;
		}else{
		last.next=node;		
		}
		node.prev=last;
		last=node;
		size++;
		
	}
	//尾删
	public void popBack(){
		if(size<=0){
			System.err.println("空链表不能被删除");
			return;
		}
		if(last==head){
			head=last=null;
		}
		else{
		last.prev.next=null;
		last=last.prev;
		}
		size--;
	}
	//给定下标做插入
	public void add(int index,int val){
		
		if(index<0||index>size){
			System.out.println("下标错误");
			return;
		}
		if(index==size){
			pushBack(val);
		
		}else if(index==0){
			pushFront(val);
		}else{
			Node pos=Find(index);
		Node node=new Node(val);
			node.prev=pos.prev;
			node.next=pos;
			node.next.prev=node;
			node.prev.next=node;
			size++;
		}		
	}
	//给定一个下标，返回下标对应的链表的val
	public Node Find(int index){
		int i=size-1-index;
		Node pos;
		if(index>i){
			pos=last;
			for(int j=0;j<i;j++){
				pos=pos.prev;
			}
		}else{
			pos=head;
		for(int j=0;j<index;j++){
			pos=pos.next;
		}
		}
		return pos;
	}
	//给定下标做删除
	public void remove(int index){
		if(index==0){
			popFront();
		}
		else if(index==size){
			popBack();
		}else{
			Node pos=Find(index);
			pos.prev.next=pos.next;
			pos.next.prev=pos.prev;
			
			size--;
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
        Insert list = new Insert();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        System.out.println("3 2 1");
        list.popFront();
        list.popFront();
		 list.popFront();
        list.popFront();
        System.out.println("");
        list.pushBack(10);
        list.pushBack(20);
        list.pushBack(30);
        System.out.println("10 20 30");
        list.popBack();
        list.popBack();
        list.popBack();
        System.out.println("");
        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(3);
        list.pushBack(4);
        list.pushBack(5);
        System.out.println("1 2 3 4 5");
        list.add(1, 10);
        System.out.println("1 10 2 3 4 5");
        list.add(5, 20);
        System.out.println("1 10 2 3 4 20 5");
        list.remove(1);
        System.out.println("1 2 3 4 20 5");
        list.remove(4);
        System.out.println("1 2 3 4 5");
    }
	
}




	
	
	
	
	
	
	
	
	
	
	
	
	
boolean isValid(String s){
	for(int i=0;i<s.length;i++){
		char c=s.charAt(i);
		
		switch(c){
			case'(';
			case'{';
			case'[';
			stack.push(c);
			break;
			
			
			
			
			if(stack.isEmpty())
		}
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	顺序表
	public class Insert{
		public static void main(string[] args){
			
		}
	}
	
	public class Shunxubiao{
		public int[] array;
		public int size;
		
		public Shunxubiao(){
			array=new int[2];
			size=0;
		}
		
		//头插
		public pushFront(int element){
			for(int i=size;i>0;i--){
				array[i]=array[i-1];
			}
			array[0]=element;
			size++;
		}
		//头删
		public popFront{
			for(int i=0;i<size;i++){
				array[i]=array[i+1];
			}
			size--;
		}
		//尾插
		public pushback(int element){
			array[size++]=element;
		}
		//尾删
		public popBack{
			array[size]=0;
			size--;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	












































































