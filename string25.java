import java.util.Scanner;
/*
class abc
{
	public static void main(String[] arg)
	{
		int n,i;
		String arr[]=new String[10];
		String arr1[]=new String[10];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		n=sc.nextInt();
		
		sc=new Scanner(System.in);
		System.out.println("enter the country names & Cities ");
		for(i=0;i<n;i++)
		{
		    arr[i]=sc.nextLine();
			arr1[i]=sc.nextLine();
		}
		for(i=0;i<n;i++)
		{
			if(arr[i].startsWith("a") || arr[i].startsWith("e") || arr[i].startsWith("i") || arr[i].startsWith("o")|| arr[i].startsWith("u"))
			{
				System.out.println(arr[i] +"\t" +arr1[i]);
			}
		}
	}
}
*/

class abc
{
	public static void main(String[] args)
	{
		int n,i,j;
		char ch;
		Scanner sc=new Scanner(System.in);
		String arr1[]=new String[10];
		int arr[]=new int[10];
		System.out.println("enter the size of array");
		n=sc.nextInt();
		System.out.println("enter the name and telephone number");
		for(i=0;i<n;i++)
		{
			sc=new Scanner(System.in);
			arr1[i]=sc.nextLine();
			arr[i]=sc.nextInt();
		}
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(arr1[i].compareTo(arr1[j])>0)
				{
					String tmp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=tmp;
					
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("Enter a letter ");
		ch=sc.next().charAt(0);
		
		for(i=0;i<n;i++)
		{
			if(arr1[i].startsWith(String.valueOf(ch)))
				System.out.println(arr1[i]+" : "+arr[i]);
		}
				
		
	}
}	
	