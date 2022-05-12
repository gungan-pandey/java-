import java.util.Scanner;
class abc
{
	public static void main(String[] arg)
	{
		int n,j=0;
		int arr[]=new int[10];
		int arr1[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		n=sc.nextInt();
		sc=new Scanner(System.in);
		System.out.println("enter the element of array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			int x=(int)Math.sqrt(arr[i]);
			if(x*x==arr[i])
			{
				arr1[j]=arr[i];
				j++;
			}
		}
		System.out.println("perfect square are :");
		for(int i=0;i<j;i++)
		{
			System.out.println(arr1[i]);
		}
	}
}