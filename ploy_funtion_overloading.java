import java.util.Scanner;
class Addition
{
	int a,b,c;
	void sum()
	{
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println("Sum is "+c);
	}
	int sum(int a,int b)
	{
		this.a=a;
		this.b=b;
		c=this.a+this.b;
		return(c);
		
	}
	void sum(int x,int y,int z)
	{
		c=x+y+z;
		System.out.println("Sum is "+c);
	}
	public static void main(String[] args)
	{
		Addition ob=new Addition();
		ob.sum();
		System.out.println("Sum is : "+ob.sum(4,5));
		ob.sum(2,3,1);
	}
}