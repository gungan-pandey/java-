import java.util.Scanner;
class abc
{
	public static void main(String[] arg)
	{
	int n,count=0,p;
		int arr[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		n=sc.nextInt();
		sc=new Scanner(System.in);
		System.out.println("enter the element of array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int c=0;
		for(int i=0;i<n;i++)
		{
			c=0;
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					c=1;
					arr[j]=0;
				}   
			}
			if(c==0)
			{   
				count++;
				if(count==3 && arr[i]!=0)
				{
					System.out.println(arr[i]);
					break;
				}
			}
		}
	}
}
				
				