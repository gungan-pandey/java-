import java.util.Scanner;
class abc
{
	public static void main(String[] arr)
	{
		String s;
		String s2="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		s=sc.nextLine();
		s=s+" ";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch!=' ')
				s2=s2+ch;
			else
			{
				System.out.println(s2+" "+s2.length());
				s2="";
			}
		}
	}
}
				