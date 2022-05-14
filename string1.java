import java.util.Scanner;
class abc
{
	public static void main(String[] arr)
	{
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter character");
		ch=sc.next().charAt(0);
		if(Character.isLetter(ch))
			System.out.println("it is letter");
		else
			System.out.println("it is not letter");
	}
}
		