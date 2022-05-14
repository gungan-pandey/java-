/*
import java.util.Scanner;
class Abc
{
	void manip(String str,int p)
	{
		if(p%2==0)
		{
			for(int i=0;i<str.length();i++)
			{
				char ch=str.charAt(i);
				if(i%2==0)
				{
					System.out.println(ch);
				}
			}
		}
		else
		{
			for(int i=0;i<str.length();i++)
			{
				char ch=str.charAt(i);
				if(i%2!=0)
				{
					System.out.println(ch);
				}
			}
		}
	}
	void manip(int a,char ch)
	{
		if(ch=='s')
		{
			int s=(int)Math.sqrt(a);
			System.out.println(s);
		}
		else
		{
			int c=(int)Math.cbrt(a);
			System.out.println(c);
		}
	}
	public static void main(String[] args)
	{
		Abc ob=new Abc();
		ob.manip("gunjan",2);
		ob.manip(27,'e');
	}
}
*/

class Add
{           
	public void add(double a,double b)
	{
		System.out.println("sum of a and b is "+(a+b));
	}
	public void sub(int a,int  b)
	{
		System.out.println("sub of a and b is "+(a-b));
	}
}
class Mathop extends Add
{            
	public void div(double a,double b)
	{
		System.out.println("div of a and b is "+(a/b));
	}
}
class Mathtest
 {        
	public static void main(String[] args) 
	{       
	Mathop m=new Mathop();
	m.add(4.5,5.5);
	m.sub(5,4);
	m.div(5.5,5.5);
	}
 }





			
			
			