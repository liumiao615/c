public class A{
	private static A a = new A();
	private A(){};
	public static A getInstance(){
		return instance;
	}
}
//此模式在类的加载阶段完成实例化，避免了线程同步问题。
//缺点：如果该类没有被使用，内存就浪费了