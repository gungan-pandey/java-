import java.util.Scanner;


/*
class abc
{
	public static void main(String[] arr)
	{
		String s;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string ");
		s=sc.nextLine();
		
			for(char c='A';c<='Z';c++)
			{
				count=0;
				for(int i=0;i<s.length();i++)
				{
					char ch=s.charAt(i);
						if(c==ch)
						{
							count++;
						}
				}
				if(count>0)
					System.out.println(c +"\t"+count);

			}
	}
}
					
*/

class abc
{
	public static void main(String[] arr)
	{
		String s;	
		int flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string ");
		s=sc.nextLine();
		
			for(char c='A' ;c<='Z';c++)
			{
				int count=0;
				for(int i=0;i<s.length();i++)
				{
					char ch=s.charAt(i);
					if(c==ch)
							count++;
				}
				if(count>1)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
				System.out.println("unique string");
	}
}	
					