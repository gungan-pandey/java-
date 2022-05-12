import java.util.Scanner;
class abc
{
	public static void main(String[] args)
	{
		int n,s=0,m;
		Scanner sc=new Scanner(System.in);
		String arr[]=new String[40];
		System.out.println("enter the size of of array");
		n=sc.nextInt();
		sc=new Scanner(System.in);
		int arr1[][]=new int[40][5];
		System.out.println("enter the number of row");
		n=sc.nextInt();
		System.out.println("enter the number of column array");
		m=sc.nextInt();
		sc=new Scanner(System.in);
		System.out.println("enter the names of student");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextLine();
		}
		sc=new Scanner(System.in);
		System.out.println("enter marks of student");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Name \t Phy \t Chem \t Math");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+"\t");
			for(int j=0;j<m;j++)
			{	
				System.out.print(arr1[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
		
		