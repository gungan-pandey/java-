import java.util.Scanner;
class abc
{
	public static void main(String[] arg)
	{
	int n,m,flag=0;
	int arr[][]=new arr[4][4];
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the number of row array");
	n=sc.nextInt();
	System.out.println("enter the number of column array");
	m=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<m;j++)
		{
			scanf("%d",&arr[i][j]);
		}
	}
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<m;j++)
		{
			p=arr[j]
			for(int p=2;p<arr[i]/2;p++)
			{
				if(arr[i]%2==0)
				{
					flag++;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println("prime number "+arr[j]);
			}
		}
	}
	}
}
			
	