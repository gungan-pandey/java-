import java.util.Scanner;
class abc
{
	public static void main(String[] arr)
	{
		String s1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		s1=sc.nextLine();
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			int a=ch;
			System.out.println("ASCII value of character"+a);
		}
	}
}