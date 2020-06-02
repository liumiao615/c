//1）
public class B{
	private static B b = null;
	private B(){}
	private static B getInstance(){
		if(b = null){
			b = new B();
			
		}
		return instance;
	}
}
//单线程模式下，线程不安全，有可能被实例化多次

//2）
public class B{
	private static B b = null;
	private B(){}
	private synchronized static B getInstance(){
		if(b = null){
			b = new B();
			
		}
		return instance;
	}
}
//synchronized 修饰整个方法，每个线程都要同步一遍，效率低下，只需要同步b = null这一次就好，

//3）
public class B{
	private static Volatile B b = null;
	private B(){}
	private static B getInstance(){
		if(b = null){
			synchronized(B.class){
				if(b == null){
					b = new B();
				}
			}
			
		}
		return instance;
	}
}
// 这种形式同步代码块，效率较高，用Volatile 保证b内存可见性