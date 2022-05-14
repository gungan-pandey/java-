/*
import java.util.Scanner;

class overloading_14
{
	void Search(int m[], int ns)
	{
		int f=0;
		for(int i=0;i<m.length;i++)
		{
			if(m[i]==ns)
				f=1;
		}
		if(f==1)
			System.out.println(ns+" Found in Array ");
		else
			System.out.println(ns+" Not Found ");
			
	}
	
	public static void main(String []ar)
	{
		int arr[]=new int[5];
		int num=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 Elements in Array ");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		
		System.out.println("Enter number to be searched ");
		num=sc.nextInt();
		
		overloading_14 ob1 = new overloading_14();
		ob1.Search(arr,num);
	}
}
*/

import java.util.Scanner;
class Abc
{
	void calculate(int m,char ch)
	{
		if(ch=='s')
		{
			if(m%7==0)
			{
				System.out.println("divisible by 7");
			}
		}
		else
		{
			int n=m%10;
			if(n==7)
				System.out.println("last digit is 7");
			else
				System.out.println("last digit is not 7");
		}
	}
	void calculate(int a,int b,char ch)
	{
		if(ch=='g')
		{
			if(a>b)
				System.out.println(a);
			else
				System.out.println(b);
		}
		else
		{
			if(a<b)
				System.out.println(a);
			else
				System.out.println(b);
		}
	}
	public static void main(String[] args)
	{
		Abc ob=new Abc();
		ob.calculate(49,'i');
		ob.calculate(6,4,'f');
	}
}
			
				
			
	