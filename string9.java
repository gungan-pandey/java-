import java.util.Scanner;
class abc
{
	public static void main(String[] arr)
	{
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		s=sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' ||ch=='o' || ch=='u')
				continue;
			else
				System.out.print(ch);
		}
		
	}
}