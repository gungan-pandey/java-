/*
import java.util.Scanner;
class Perimeter
{
	void Perimeter()
	{
		int s,ps;
		Scanner sc=new Scanner(System.in);
		s=sc.nextInt();
		ps=4*s;
		System.out.println(ps);
	}
	void Perimeter(int l,int b)
	{
			int pr;
			pr=2*(l+b);
			System.out.println(pr);
	}
	void Perimeter(int r)
	{
		float pc;
		pc=2*(22/7)*r;
		System.out.println(pc);
	}
	public static void main(String[] args)
	{
		Perimeter ob=new Perimeter();
		ob.Perimeter();
		ob.Perimeter(4,5);
		ob.Perimeter(3);
	}
}
*/

import java.util.Scanner;
class Abc
{
	void display(String str,int p)
	{
		String s=" ";
		if(p==1)
		{
			for(int i=0;i<str.length();i++)
			{
				char ch=str.charAt(i);
				if(character.toUpperCase(ch))
				{
					s=ch;
				}
			}
		}
	
		else
		{
			for(int i=0;i<str.length();i++)
			{	
				char ch=str.charAt(i);
				if(character.tolowerCase(ch));
				{
					s=ch;
				}
			}
		}
	}
	void display(String str,char chr)
	{
		String s=" ";
		if(ch=='v')
		{
			for(int i=0;i<str.length();i++)
			{
				char ch=str.charAt(i);
				if(ch=='a' || ch='e' || ch='i' || ch='o' || ch='u')
				{
					s=ch;
				}
			}
			System.out.println(s);
		}
		else
		{
			for(int i=0;i<str.length();i++)
			{
				char ch=str.charAt(i);
				if(ch!='a' || ch!='e' || ch!='i' || ch!='o' || ch!='u')
				{
					s=ch;
				}
			}
			System.out.println(s);
		}
	}
			
	public static void main(String[] args)
	{
			Abc ob=new Abc();
			ob.display("abcSERHDlkj",1);
			ob.display("abyueoki",'v');
	}
}