//lab question 4
/*
import java.util.Scanner;
class Student 
{
	public static void main(String[] args)
	{
		String n,n2="";
		int count=0,rem=0,sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter string");
		n=sc.nextLine();
		n+=" ";
		
		for(int i=0;i<n.length();i++)
		{
			char ch=n.charAt(i);
			if(ch!=' ')
				n2+=ch;
			else
			{
				System.out.println(n2+" "+n2.length());
				sum+=n2.length();
				n2="";
			}
		}
		while(true)
		{
			int num=sum;
			sum=0;
			while(num>0)
			{
				rem=num%10;
				sum=sum+rem;
				num/=10;
			}
			if(sum<=9)
				break;
		}
		System.out.println(sum);
	}
}
*/

//lab 4

import java.util.Scanner;
{
class Student 
{
	public static void main(String[] args)
	{
		int a=0,b=1,c;
		System.out.println("enter string");
		Scanner sc= new Scanner(System.in);
		