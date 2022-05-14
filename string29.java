import java.util.Scanner;

class abc
{
	public static void main(String[] arg)
	{
		int n,i;
		String s2="",s3="";
		String arr[]=new String[20];
		char ch;

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the size of array");
		n=sc.nextInt();
		
		sc=new Scanner(System.in);
		System.out.println("enter the cities name");
		for(i=0;i<n;i++)
			arr[i]=sc.nextLine();
		
		for(i=0;i<n;i++)
		{
			s2=arr[i];
			s3="";
			for(int j=0;j<s2.length();j++)
				s3=s2.charAt(j)+s3;
			
			if(s2.equals(s3))
				System.out.println(s2);
		}
	}
}