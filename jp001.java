import java.util.Scanner;

class abc
{
	public static void main(String [] ar)
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number for a ");
		a=sc.nextInt();
		System.out.println("Enter Number for b ");
		b=sc.nextInt();
		
		c=a+b;
		
		System.out.println("Sum is "+c);
	}
}