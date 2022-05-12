import java.util.Scanner;
class abc
{
	public static void main(String[] arg)
	{
		int n,temp,m;
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
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				for(int k=j+1;k<m;k++)
				{
					if(arr[i][j]>arr[i][k])
					{
						temp=arr[i][j];
						arr[i][j]=arr[i][k];
						arr[i][k]=temp;
					}
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
		