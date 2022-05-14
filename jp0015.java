import java.util.Scanner;
class abc
{
	public static void main(String[] arr)
	{
		int year;
	 Scanner sc=new Scanner(System.in);
	 year=sc.nextInt();
	 if(year%4==0 && year%400==0)
		 System.out.println("century leap year");
	else if(year%4!=0 && year%400==0)
		System.out.println("century year but not leap year");
	else if(year%4==0)
		System.out.println(" leap year");
	else if(year%400==0)
		System.out.println("year is not leap year");
	}
}