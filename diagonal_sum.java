import java.util.Scanner;
class abc
{
	public static void main(String[] args)
	{
		int n,s=0,s1=0,sum=0,m;
		Scanner sc= new Scanner(System.in);
		int arr[][]=new int[4][4];
		System.out.println("enter the number of row array");
		n=sc.nextInt();
		System.out.println("enter the number of column array");
		m=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(i==j)
				{
					s=s+arr[i][j];
				}
				if(i+j==2)
				{
					s1=s1+arr[i][j];
				}
			}
		}
		sum=s+s1;
		System.out.println("sum of diagonal is:"+sum);
	}
}