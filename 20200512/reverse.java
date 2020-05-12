//删除链表中等于给定值 val 的所有节点。

public Node removeElements(Node head,int val){
	Node cur=head;
	Node result=null;
	Node prev=null;
	while(cur!=null){
		if(cur.val==val){
			if(cur==head){
				head=cur.next;
			}else{				
				//cur=cur.next;
                //prev.next=cur;错误：修改了cur的值.下面cur=cur.next编译不过。
				prev.next=cur.next;
			}
		}
		else{
			prev=cur;
		}
		cur=cur.next;
	}
}


//反转一个单链表
public Node reverse(Node head){
	Node result=null;
	Node cur=head;
	while(cur!=null){
		Node next=cur.next;
		cur.next=result;
		result=cur;
		
		cur=next;
	}
}

 //给定一个带有头结点 head 的非空单链表，返回链表的中间结点。
 //如果有两个中间结点，则返回第二个 中间结点。

public Node Mid1(Node head){
	Node cur=head;
	int size=0;
	for(Node cur=head;cur!=null;cur=cur.next){
		size++;
	}
	int len=size/2;
	for(int j=0;j<len;j++){
		cur=cur.next;
	}
	return cur;
}
public Node Mid2(Node head){
	Node fast=head;
	Node slow=head;
	while(fast!=null){
		fast=fast.next;
		slow=slow.next;
		fast=fast.next;
	}
	return slow;
}

//输入一个链表，输出该链表中倒数第k个结点

public Node print1(Node head,int k){
	Node cur=head;
	int size=0;
	for(Node cur=head;cur!=null;cur=cur.next){
		size++;
	}
	if(size<n){
		return null;
	}
	int len=size-n;
	for(int j=0;j<len;j++){
		cur=cur.next;
	}
	return cur;
}



public Node print2(Node head,int k){
	Node front=head;
	Node back=head;
	
	for(int i=0;i<k;i++){
		if(front==null){
			return null;
		}
		front=front.next;
	}
	while(front!=null){
		back=back.next;
		front=front.next;
	}
return back;
}






////删除重复链表
class Node{
	Node next;
	int val;
}
public Node delect(Node head){
	
	Node prev=new Node();
	Node fake=prev;
	prev.next=head;
	Node p1=head;
	Node p2=head.next;
	
	while(p2!=null){
		if(p1.val!=p2.val){
			prev=p1;
			p1=p2;
			p2=p2.next;
		}else{
			while(p2!=null&&p1.val=p2.va1){
				p2=p2.next;
			}
			prev.next=p2;
			p1=p2;
			if(q!=null){
				q=q.next;
			}
			
		}
	}
	reurn fake.next;
}













































