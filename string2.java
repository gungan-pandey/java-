import java.util.Scanner;
class abc
{
	public static void main(String[] arr)
	{
		char ch;
		float x;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter character");
		ch=sc.next().charAt(0);
		System.out.println("enter number");
		x=sc.nextFloat();
		int a=ch;
		int y= (int) x;
		System.out.println("ASCII value of character is" +a);
		System.out.println(" float is converted in integer"+y);
		
		
		
	}
}