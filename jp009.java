import java.util.*;
class student
{
	public static void main(String[] arr)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sum and number of days");
		double s=sc.nextDouble();
		double m=0;
		double a=0;
		int d=sc.nextInt();
		if(d<=180)
		{
			m=(s*5.5)/100;
			a=m+s;
			System.out.println("The Maturity Value=" +a);
		}
		if(d>180 && d<=364)
		{
			m=(s*7.5)/100;
			a=m+s;
			System.out.println("The Maturity Value=" +a);
		}
		
		if(d==365)
		{
			m=(s*9.0)/100;
			a=m+s;
			System.out.println("The Maturity Value=" +a);
		}
		if(d>365)
		{
			m=(s*8.5)/100;
			a=m+s;
			System.out.println("The Maturity Value=" +a);
		}
	}
}
		
		
		
		
		
		