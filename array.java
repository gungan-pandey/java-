import java.util.Scanner;
/*
class abc
{
	public static void main(String[] arg)
	{
		int n,counteven=0,countodd=0;
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
		for(int i=1;i<n;i+=2)
		{
			if(arr[i]%2==0)
				System.out.println("even number are "+arr[i]);
		}
	}
}
        		
*/

/*
class abc
{
	public static void main(String[] arg)
	{
		int n,counteven=0,countodd=0;
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
		for(int i=0;i<n;i++)
		{
			System.out.println(i+" "+arr[i]);
			
			if(i%2==0 && arr[i]%2!=0)
					countodd++;
			if(arr[i]%2==0 && i%2!=0)
					counteven++;
		}
		
		System.out.println("odd number at even place"+countodd);
		System.out.println("even number at odd place"+counteven);
	}
}
*/

class abc
{
	public static void main(String[] arg)
	{
		int n,counteven=0,countodd=0;
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
		for(int i=0;i<n;i++)
		{
			if(arr[i]<0)
				System.out.print(arr[i]+"\t");
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]>0)
				System.out.print(arr[i]+"\t");
		}
	}
}