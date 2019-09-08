public class Mult{
	public static void main(String[] args){
	int a=1;
	int b=1;
	int sum=0;
	for(a=1;a<10;a++)
	{
		for(b=1;b<=a;b++)
		{
			sum=a*b;
			//System.out.printf("%d*%d=%d\t",a,b,sum);
			System.out.print(a+" * "+b+"="+(a*b));
		}
		System.out.printf("%n");
	}
	}	
}
