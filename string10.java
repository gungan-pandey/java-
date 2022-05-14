import java.util.Scanner;
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
				System.out.print(s.charAt(i+1)+"\t");
		
		}
	}
}