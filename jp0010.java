import java.util.*;
class student
{
	public static void main(String[] arr)
	{
		
		Scanner sc=new Scanner(System.in);
		double f,c;
		System.out.println("1 for converting Celsius to Fahrenheit \n 2 for converting Fahrenheit to Celsius\n");
		int ch=sc.nextInt();
		
		switch(ch)
		{
			case 1:
				System.out.println("enter temperature");
				c=sc.nextDouble();
				f=1.8*c+32;
				System.out.println(" Temperature in Fahrenheit is:" +f);
				break;
			case 2:
				System.out.println("enter temperature");
				f=sc.nextDouble();
				c=5/9*(f-32);
				System.out.println(" Temperature in Celsius is:" +c);
				break;
		}
	}
}