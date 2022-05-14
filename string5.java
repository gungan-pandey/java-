import java.util.Scanner;
class abc
{
	public static void main(String[] arr)
	{
		String s1="gunjan and anshika";
		
		System.out.println(s1);
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			System.out.println(ch);
		}
		
		String s2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		s2=sc.nextLine();
		System.out.println(s2);
	}
}