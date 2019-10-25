public class Test {
	public static void insert(int index, int element, int[] array, int size) {
		if (index < 0 || index > size) {
			System.err.println("下标错误");
			return;
		}
		
		for (int i = size - 1; i >= index; i--) {
			array[i + 1] = array[i];
		}
		array[index] = element;
		size++;
	}
	
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		
		insert(3, 100, a, a.length);
	}
}