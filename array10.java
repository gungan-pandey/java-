import java.util.Scanner;
class abc
{
	public static void main(String[] arg)
	{
		int n,j=0,k=0;
		int arr[]=new int[10];
		int arreven[]=new int[10];
		int arrodd[]=new int [10];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
	    n=sc.nextInt();
		sc=new Scanner(System.in);
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0)
			{
				arreven[j]=arr[i];
				j++;
			}
			else
			{
				arrodd[k]=arr[i];
				k++;
			}
		}
		System.out.println("even number in the array" );
		for(int i=0;i<j;i++)
		{
		System.out.print(arreven[i] + "\t");
		}
		System.out.println();
		System.out.println("odd number in the array"); 
		for(int i=0;i<k;i++)
		{
		System.out.print(arrodd[i] +"\t");
		}
	}
}
