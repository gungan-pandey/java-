import java.util.Scanner;
class abc
{
	public static void main(String[] arg)
	{
	int n,m,flag=0,i=0;
	int arr[]=new int[10];
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the size of array");
	n=sc.nextInt();
	for(int i=2;i<=2*n;i++)
	{
		int p=i;
		for(int j=2;j<p/2;j++)
		{
			if(j%2==0)
			{
				flag++;
				break;
			}
		}
		if(flag==0)
		{
			arr[i]=p;
			i++;
		}
	}
	for(int j=0;j<i;j++)
	{
		System.out.println(arr[i]);
	}
	}
}
		
	
	
	
			
	