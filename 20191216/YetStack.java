import java.util.Arrays;

public class YetStack {
	private int[] array;
	private int top;	// 指向当前栈顶元素的下标
	
	public Stack(int defaultCapacity) {
		array = new int[defaultCapacity];
		top = -1;
	}
	
	public Stack() {
		this(20);
	}
	
	public void push(int val) {
		if (top + 1 == array.length) {
			array = Arrays.copyOf(array, array.length * 2);
		}
		array[++top] = val;
		
	}
	
	public void pop() {
		if (top < 0) {
			System.out.println("栈为空，无法删除");
			return;
		}
		
		array[top] = 0;	// 可加可不加，把所有空的位置保持为 0
		top--;
	}
	
	public int top() {
		if (top < 0) {
			System.out.println("栈为空，无法返回栈顶元素");
			return -1;
		}
		
		return array[top];
	}
	
	public int size() {
		return top + 1;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
}