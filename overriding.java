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
		
		
			