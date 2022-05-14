import java.util.Scanner;
class abc
{
	public static void main(String[] arr)
	{
		int a;
		int countpositive=0,countnegative=0,sum_posi=0,sum_negative=0;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			a=sc.nextInt();
			if(a>0)
			{
			countpositive++;
			System.out.println("positive no:"+a);
			sum_posi+=a;
			}
			else
			{
				countnegative++;
				System.out.println("negative no:"+a);
				sum_negative+=a;
			}	
		}
		System.out.println("sum of positive number is:"+sum_posi);
		System.out.println("sum of negative number is:"+sum_negative);
	}
}