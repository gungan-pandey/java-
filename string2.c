import java.util.Scanner;
class abc
{
	public static void main(String[] arr)
	{
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter character");
		ch=sc.next().charAt(0);
		int a=ch;
		System.out.println("ASCII value of character is %d",a);
	}
}