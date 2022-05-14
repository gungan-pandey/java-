import java.util.Scanner;
class Student
{
	public static void main(String[] arr)
	{   int a,b,f=0,f1=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter to unequal positive number");
		a=sc.nextInt();
		b=sc.nextInt();
		for(int i=1;i<a;i++)
		{ 
			if(i*i==a)
			{
				f=1;
				break;
			}
		}
		for(int i=1;i<b;i++)
		{ 
			if(i*i==b)
			{
				f1=1;
				break;
			}
		}
		if(f==1 && f1==1)
			System.out.println("They are perfect square");
		else if(f==1 && f1!=1)
		{
			System.out.println( a+ "is a perfect square number");
		    System.out.println( b+ "is not a perfect square number");
		}
		else if(f!=1 && f1==1)
		{
			System.out.println( b+ "is a perfect square number");
			System.out.println( a+ "is not a perfect square number");
		}
		
	}
}	