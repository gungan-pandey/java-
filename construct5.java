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
	}
	
	void print()
	{
		for(int i=0;i<str.length();i++)
		{
			char ch1=str.charAt(i);
			ch1++;
			ch1++;
			System.out.print(ch1);
		}
	}
	
	public static void main(String[] arr)
	{
		Stringop ob=new Stringop("");
		ob.accept();
		ob.print();
	}
}
		