import java.util.Scanner;
interface A
{
	int x=10;
	void input();
	void sum();
}
class Xyz implements A
{
	int a,b,c=0;
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
	}
	public void sum()
	{
		c=a+b+x;
		System.out.println(c);
	}
	public static void main(String[] args)
	{
		Xyz ob=new Xyz();
		ob.input();
		ob.sum();
	}
}
	