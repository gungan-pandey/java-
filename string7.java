import java.util.Scanner;
class abc
{
	public static void main(String[] arr)
	{
		String s1;
		int countlower=0,countupper=0,countdigit=0,countwhiteS=0,countS=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Senetence ");
		s1=sc.nextLine();
		
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(Character.isUpperCase(ch))
				countupper++;
			else if(Character.isLowerCase(ch))
				countlower++;
			else if(Character.isDigit(ch))
				countdigit++;
			else if(Character.isWhitespace(ch))
				countwhiteS++;
			else
				countS++;
		}
		System.out.println("lower case"+countlower);
		System.out.println("upper case"+countupper);
		System.out.println("digit :"+countdigit);
		System.out.println("white space :"+countwhiteS);
		System.out.println("special "+countS);
	}
}
			
		