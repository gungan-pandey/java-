import java.util.Scanner;
class abc
{
	public static void main(String[] args)
	{
		int n,s=0,sum=0,m;
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
			s=0;
			for(int j=2;j>=0;j--)
			{
				s=s+arr[i][j];
			}
			System.out.println("sum of row"+s);
		}
	}
}
		