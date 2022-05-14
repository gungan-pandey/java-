import java.util.Scanner;
class abc
{
public static void main(String[] arr)
	{ 
		char ch;
		char ch1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the character");
		ch=sc.next().charAt(0);
		if(Character.isLetter(ch))
		{ 
			if(Character.isUpperCase(ch))
			{ 	
				System.out.println(Character.toLowerCase(ch));
			}
			else
			    System.out.println(Character.toUpperCase(ch));
		}
		else if(Character.isDigit(ch))
		{
			System.out.println("it is digit");
		}
		else
			System.out.println("it is special character");
	}
}
				