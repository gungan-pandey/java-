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

importjava.util.Scanner;
class Pattern
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of a number:\n");
		int n = sc.nextInt();
		int x=1;
		for(inti=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(x++ +" ");
			}
			System.out.println();
		}
	}
}













			
			
			