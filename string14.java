import java.util.Scanner;
/*
class abc
{
	public static void main(String[] arr)
	{
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the words");
		s=sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			int a=ch;
			System.out.println("ASCII OF ="+a);
		}
	}
}
*/

/*
class abc
{
	public static void main(String[] arr)
	{
		String s,s2="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string in upper case");
		s=sc.nextLine();
		s=s.toUpperCase();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				s2+="*";
			else
				s2+=ch;
		}
		System.out.println(s2);
	}
}
*/


/*
class abc
{
	public static void main(String[] arr)
	{
		String s,s2="",s3="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string in upper case");
		s=sc.nextLine();
		s=s+" ";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch!=' ')
			{
				s2=s2+ch;
				s3=ch+s3;
			}
			else
			{ 
				if(s2.equals(s3))
					System.out.println(s2);
				
				s2="";
				s3="";
			}
		}
	}
}
*/


/*
class abc
{
	public static void main(String[] arr)
	{
		String s,s1="",s2="";
		int count=0,c1=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string ");
		s=sc.nextLine();
		s=s+" ";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch!=' ')
			{	
				s1=s1+ch;
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
					count++;
			}
			else
			{
				if(count>c1)
				{
					c1=count;
					s2=s1;
				}
				s1="";
			}
		}
					System.out.print(s2);
		
	}
}
*/


class abc
{
	public static void main(String[] arr)
	{
		String s,s1="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string ");
		s=sc.nextLine();
		s+=" ";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch!=' ')
			{ 
				s1=s1+ch;
			}
			else
			{
				if(s1.equals("Blue"))
					System.out.print("Red ");
				else
					System.out.print(s1+" ");
				s1="";
			}
		}
	}
}
			