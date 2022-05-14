import java.util.Scanner;
/*
class abc
{
	public static void main(String[] arr)
	{
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		s=sc.nextLine();
		s=" "+s;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(Character.isWhitespace(ch))
				System.out.print(s.charAt(i+1));
			else
				continue;
		}
	}
}
*/

class abc
{
	public static void main(String[] arr)
	{
		String s,s1="";
		int index;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		s=sc.nextLine();
		s=" "+s;
		for(int i=s.length()-1;i>=0;i--)
		{ 
			char ch=s.charAt(i);
			if(ch!=' ')
				s1=ch+s1;
			else
			{
			System.out.println(s1);
			s1="";
			}
		}
	}
}
				
			
	
			
			