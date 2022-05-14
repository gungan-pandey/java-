import java.util.Scanner;
class student
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the three number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int sum=a+b+c;
		int x=Math.max(a,b);
		int big=Math.max(x,c);
		System.out.println("biggest number is"+big);
		int y=Math.min(a,b);
		int small=Math.min(y,c);
		System.out.println("smallest number is"+small);
		int secondsmall=sum-big-small;
		System.out.println("Second Smallest number is"+ secondsmall);
	}
}