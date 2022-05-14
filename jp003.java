import java.util.Scanner;
class student
{
   public static void main(String [] arr)
   {
	   int a,b,c;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the first number");
	   a=sc.nextInt();
	   System.out.println("enter the second number");
	   b=sc.nextInt();
	   System.out.println("enter the third number");
	   c=sc.nextInt();
	   
	   if (a>b && a>c)
		   System.out.println("Greatest number:"+a);
	   else if(b>a && b>c)
			System.out.println("Greatest number:"+b);
	   else if(c>a && c>b)
			System.out.println("Greatest number:"+c);
	   else 
			System.out.println("All the number are equal");
   }
}