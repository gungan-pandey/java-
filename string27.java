import java.util.Scanner;

class abc
{
		public static void main(String[] arg)
		{
			int i,n;
			Scanner sc=new Scanner(System.in);
			String arr[]=new String[20];
			System.out.println("enter the size of array");
			n=sc.nextInt();
	
			sc=new Scanner(System.in);
			System.out.println("enter the name in array");
			for(i=0;i<n;i++)
			{
				arr[i]=sc.nextLine();
			}
			for(i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(arr[i].compareTo(arr[j])<0)
					{
						String tmp=arr[i];
						arr[i]=arr[j];
						arr[j]=tmp;
					}
				}
			}
			System.out.println();
		for(i=0;i<n;i++)
		{
				System.out.println(arr[i]);
		}
		}
}