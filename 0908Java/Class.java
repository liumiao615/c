/* class Person{
	public String name=null;
	public int gender=0;
	public int age=0;
	
	public String toString(){
		return String.format("person(%s,%d,%d)",name,gender,age);
	}
	public Person(String n,int g,int a){
		name=n;
		gender =g;
		age=a;
	}
}
public class Class{
	public static void main(String[] avgs){
		Person p=new Person("小比特",2,4);
		System.out.println(p.toString());
	}
d:d
}
 */

public class Class{
	public static void main(string[] args){
		person.setCountry("中国");
		person.p=new person("刘苗",20);
		person.getPerson();
		
	}
} 
class person{
	private static String country;
	private String name;
	private int age;
	
	public person(String name,int age){
		this.name=name;
		this.age=age;
	}
	public static void setCountry(string c){
		country=c;
	}
	
public void getPerson(){
	System.out.println("姓名:"+this.name+",年龄:"+this.age+",国家:"+this.country");
}
}

















