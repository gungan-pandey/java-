import java.util.Scanner;
class abc
{
	public static void main(String[] args)
	{
		int n,s=0,m;
		String p;
		Scanner sc=new Scanner(System.in);
		
		String arr[]=new String[5];
		System.out.println("enter the size of of array");
		n=sc.nextInt();
		
		int arr1[][]=new int[5][10];
		
		System.out.println("enter the number of floor");
		n=sc.nextInt();
		System.out.println("enter the number of room");
		m=sc.nextInt();
		
		sc=new Scanner(System.in);
		System.out.println("enter the names of visitor");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextLine();
		}
		sc=new Scanner(System.in);
		System.out.println("enter room no.");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter the name of visitor ");
		sc=new Scanner(System.in);
		p=sc.nextLine();
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(p.equals(arr1[i])
			}
		}