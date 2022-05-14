import java.util.Scanner;
class abc
{
	public static void main(String[] arr)
	{
		String s;
		int c1=0,c2=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		s=sc.nextLine();
		s=" " +s;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(Character.isLetter(ch))
			{
				c1++;
			}
			else if(Character.isWhitespace(ch))
			{
				c2++;
			}
		}
		System.out.println("number of letter"+c1);
		System.out.println(" number of words"+c2);
	}
}
		
		