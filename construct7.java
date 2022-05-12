import java.util.Scanner;
class Stringop
{
	String str;
	char ch;
	int i;
	Stringop(String x)
	{
		str=x;
	}
	void accept()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter a sentence");
		str=sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
			char ch1=str.charAt(i);
			int a=ch1;
			ch=(char)(a+1);
			
		}
	}
	void input()
	{
		System.out.println(ch);
	}
	
	public static void main(String[] arr)
	{
		Stringop ob=new Stringop(" ");
		ob.accept();
		ob.input();
	}
}
		