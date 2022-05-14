/*
import java.util.Scanner;
class Gunjan
{
	int age=10;
}
class mansi extends Gunjan
{
	int age=20;
	void display(int age)
	{
		System.out.println(super.age);
		System.out.println(this.age);
		System.out.println(age);
	}
	public static void main(String[] agrs)
	{
		mansi ob=new mansi();
		ob.display(15);
	}
}
*/

/*
import java.util.Scanner;
class Gunjan
{
	void display()
	{
		System.out.println("gungan");
	}
}
class mansi extends Gunjan
{
	void display()
	{
		super.display();
		System.out.println("mansi");
	}
	public static void main(String[] agrs)
	{
		mansi ob=new mansi();
		ob.display();
	}
}	
*/

/*
import java.util.Scanner;
class Number
{
	void compare()
	{
		System.out.println("enter two integer value");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a>b)
			System.out.println(a);
		else
			System.out.println(b);
	}
}
class Character_1 extends Number
{
	void compare()
	{
		super.compare();
		System.out.println("enter two character value");
		Scanner sc=new Scanner(System.in);
		int a=sc.next().charAt(0);
		int b=sc.next().charAt(0);
		if(a>b)
			System.out.println(a);
		else
			System.out.println(b);
	}
}
class String_1 extends Character_1 
{
	void compare()
	{
		super.compare();
		String s=" ",s1=" ";
		System.out.println("enter two string");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		s1=sc.nextLine();
		int a=s.length();
		int b=s1.length();
		if(a>b)
			System.out.println(a);
		else
			System.out.println(b);
	}
	public static void main(String[] agrs)
	{
		String_1 ob=new String_1();
		ob.compare();
	}
}
*/
//21 
/*
import java.lang.Math;
import java.util.Scanner;
class Student
{
	void series()
	{
		double sum=0.0;
		System.out.println("enter last number");
		Scanner sc=new Scanner(System.in);
		double a=sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			sum=sum+(double)(1.0/i);
		}
		System.out.println("sum of series"+sum);
	}
}
class Abc extends Student 
{
	void series()
	{
		super.series();
		double sum=0.0;
		System.out.println("enter  number");
		Scanner sc=new Scanner(System.in);
		double a=sc.nextInt();
		System.out.println("enter power : 2");
		double n=sc.nextInt();
		double k=1;
		for(int i=0;i<=a;i++)
		{
			double x=Math.pow(a,n);
			sum=sum+(k/x);
			k+=3;	
			n+=3;
		}
		System.out.println("sum of series"+sum);
	}
	public static void main(String[] agrs)
	{
		Abc ob=new Abc();
		ob.series();
	}
}
*/

/*
import java.util.Scanner;
import java.lang.Math;
class A
{
	double a,n,sum;
	void input()
	{ 
		System.out.println("enter last number");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("enter power : 2");
		n=sc.nextInt();
	}
	void series()
	{
		sum=0;
		for(int i=1;i<=a;i++)
			sum=sum+(double)(1.0/i);
	}
}
class B extends A
{
	double sum=0;
	void series()
	{
		double k=1;
		for(int i=0;i<=a;i++)
		{
			double x=Math.pow(a,n);
			sum=sum+(k/x);
			k+=3;	
			n+=3;
		}
	}
	void display()
	{
		series();
		super.series();
		System.out.println("sum of series"+super.sum);
		System.out.println("sum of series"+this.sum);
	}
	public static void main(String[] agrs)
	{
		B ob=new B();
		ob.input();
		ob.display();
	}
}
*/

//24 by overriding
import java.util.Scanner;
class Student
{
	Scanner sc=new Scanner(System.in);
	void display()
	{
		int a,b,c;
		System.out.println("enter number");
		
		a=sc.nextInt();
		b=(int)Math.sqrt(a);
		if((b*b)==a)
			System.out.println("perfect square");
		else
			System.out.println("not perfect square");
	}
}
class Abc extends Student 
{ 
	void display()
	{
		super.display();
		String a=" ";
		char ch;
		System.out.println("enter words");
		sc=new Scanner(System.in);
		a=sc.nextLine();
		System.out.println("enter character");
		Scanner s=new Scanner(System.in);
		ch=s.next().charAt(0);
		for(int i=0;i<a.length();i++)
		{
			char c=a.charAt(i);
			if(c==ch)
				System.out.println("character is present");
		}
	}
}
class xyz extends Abc
{
	void display()
	{
		super.display();
		String a=" ";
		int count=0;
		System.out.println("enter words");
		sc=new Scanner(System.in);
		a=sc.nextLine();
		for(int i=0;i<a.length();i++)
		{
			char ch=a.charAt(i);
			if(!(Character.isWhitespace(ch)) && !(Character.isLetter(ch)) && !(Character.isDigit(ch)));
			{
				count++;
			}
		}
		if(count==0)
			System.out.println("not special character");
		else
			System.out.println("special character");
	}
	public static void main(String[] agrs)
	{
		xyz ob=new xyz();
		ob.display();
	}
}	
		
		
		
		