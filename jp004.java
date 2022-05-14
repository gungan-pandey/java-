import java.util.Scanner;
class student
{
	public static void main(String [] arr)
	{
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		a=sc.nextInt();
		if(a%3==0 && a%5==0)
			System.out.println("number is divisible by 3 and 5");
		else 
		{
			if(a%3==0 && a%5!=0)
				System.out.println("number is divisible by 3 and not by 5");
				
			else if(a%3!=0 && a%5==0)
				System.out.println("number is divisible by 5 and not by 3");
			else
				System.out.println("number neither divisible by 3 no");
		}
	}
}	
		
		