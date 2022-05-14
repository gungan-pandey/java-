import java.util.Scanner;
class abc
{
	public static void main(String[] arr)
	{
		String s;
		int index=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		s=sc.nextLine();
		
		for(int i=s.length()-1;true;i--)
		{
			if(s.charAt(i)==' ')
			{
				index=i;
				break;
			}
		}
		for(int j=index;j<s.length();j++)
			System.out.print(s.charAt(j)+"\t");
		
		for(int i=0; i<index;i++)
			System.out.print(s.charAt(i));
	}
}
		