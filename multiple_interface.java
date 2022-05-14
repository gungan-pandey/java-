import java.util.Scanner;
interface A
{
	int x=10;
	void input();
	void sum();
}
interface B 
{
	void product();
	void display();
}
class Abc implements A,B
{
	int a,b,c,d;
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
	}
	public void sum()
	{
		c=a+b+x;
		//System.out.println("sum is"+c);
	}
	public void product()
	{
		 d=a*b;
		//System.out.println("product is "+c);
	}
	public void display()
	{
		System.out.println("sum is"+c);
		System.out.println("product is "+d);
	}
	public static void main(String[] args)
	{
		Abc ob=new Abc();
		ob.input();
		ob.sum();
		ob.product();
		ob.display();
	}
}
		