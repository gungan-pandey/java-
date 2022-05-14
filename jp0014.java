import java.util.Scanner;
class abc
{
	public static void main(String[] arr)
	{
		int m,n;
		int sum_even=0,sum_odd=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the starting number");
		m=sc.nextInt();
		System.out.println("enter the last number");
		n=sc.nextInt();
		for(int i=m;i<n;i++)
		{
			if(i%2==0)
				sum_even+=i;
			else
				sum_odd+=i;
		}
		System.out.println("sum of even number"+sum_even);
		System.out.println("sum of even number"+sum_odd);
	}
}