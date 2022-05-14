import java.util.Scanner;
class abc
{
	public static void main(String[] arr)
	{
		String s;
		String s1="";
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string ");
		s=sc.next();
		s=s.toUpperCase();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			s1+=String.valueOf((int)ch-64);
		}
		System.out.println(s1);
		int x=Integer.parseInt(s1);
		while(x>9)
		{
			int n=x;
			while(n!=0)
			{
				int r=n%10;
				sum=sum+r;
				n/=10;
			}
			x=sum;
			sum=0;
		}
		System.out.println(x);
		if(sum==1)
			System.out.println("a happy word");
		
	}
}
			
			
			
			