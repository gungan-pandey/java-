/*
import java.util.Scanner;
class abc
{
	int a,b,c;
	void sum()
	{
		System.out.println("enter the value of a,b,c");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args)
	{
		abc ob=new abc();
		ob.sum();
	}
}
*/

/*
import java.util.Scanner;
class Abc
{
	int a,b,c;
	void sum(int a,int b)
	{
		this.a=a;
		this.b=b;
		c=a+b;
		System.out.println("sum is"+c);
	}
	public static void main(String[] args)
	{
		Abc ob1=new Abc();
		ob1.sum(17,18);
	}
}
*/

/*
import java.util.Scanner;
class Abc
{
	int a,b,c;
    int sum()
	{
		a=10;
		b=20;
		c=a+b;
		return c;
	}
	public static void main(String[] args)
	{
		Abc ob1=new Abc();
		int x=ob1.sum();
		System.out.println("sum "+x);
	}
}
*/

import java.util.Scanner;
class Abc
{
	int a,b,c;
	int sum(int x,int y)
	{
		return(x+y);
	}
	public static void main(String[] args)
	{
		Abc ob1=new Abc();
		int x=ob1.sum(12,8);
		System.out.println("sum "+ob1.a);
	}
}

