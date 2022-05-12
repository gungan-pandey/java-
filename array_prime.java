import java.util.Scanner;
class abc
{
	public static void main(String[] arg)
	{
	int n,m,flag=0,k=0;
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the size of array");
	n=sc.nextInt();
	int arr[]=new int[n];
	
	for(int i=2;k<n;i++)
	{
		int p=i;
		flag=0;
		for(int j=2;j<p;j++)
		{
			if(p%j==0)
				flag++;
		}
		if(flag==0)
			arr[k++]=p;
	}
	
	for(int j=0;j<k;j++)
	{
		System.out.println(arr[j]);
	}
	}
}
		
	
	
	
			
	