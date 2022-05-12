import java.util.Scanner;
class abc
{
	public static void main(String[] args)
	{
		int n,s=0,m;
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
		for(int i=0;i<3;i++)
		{	s=0;
			for(int j=0;j<3;j++)
			{
				s=s+arr[j][i];
			}
			System.out.println("sum of column"+s);
		}
	}
}
				