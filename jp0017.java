import java.util.Scanner;
class abc
{
	public static void main(String[] arr)
	{
		int n,i;
		int count=0;
		Scanner sc=new Scanner(System.in);
		
		for(i=1;i<10;i++)
		{
			n=sc.nextInt();
			if(n%5==0)
			{
				if(n%10==5)
				{
					System.out.println("number ending with 5:"+n);
				}
				else
				{
					count++;
					System.out.println("number ending with 0:"+n);
				}
			}
		
		}
			System.out.println(" total numbers ending with 0 : "+count);
	}
}
				