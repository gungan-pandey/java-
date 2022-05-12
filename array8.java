import java.util.Scanner;
class abc
{
	public static void main(String[] arg)
	{
		int n;
		int temp=0;
		int arr[]=new int[20];
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter the size of array");
	    n=sc.nextInt();
		sc=new Scanner(System.in);
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int m=n/2;
		for(int i=0;i<m;i++)
		{
			for(int j=i+1;j<m;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int i=m;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]<arr[j])
				{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}
		System.out.println("array ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i] +"\t");
		}
	}
}