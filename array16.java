import java.util.Scanner;
class abc
{
	public static void main(String[] arg)
	{
		int n,low,high,mid,num,f=0;
		int arr[]=new int[20];
		System.out.println("enter the size of array");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		sc=new Scanner(System.in);
		System.out.println("enter the year in array");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		low=0;
		high=n-1;
		sc=new Scanner(System.in);
		System.out.println("enter the year you want to search");
		num=sc.nextInt();
		
		while(low<=high)
		{
			mid=(low+high)/2;
			if(num>arr[mid])
				low=mid+1;
			else if(num<arr[mid])
				high=mid-1;
			else
			{
				f=1;
				break;
			}
		}
	
		if(f==1)
			System.out.println("record exist");
		else
			System.out.println("record not exist");
	}
}