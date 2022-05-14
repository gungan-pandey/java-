import java.util.Scanner;
class abc
{
	public static void main(String[] arg)
	{
	 int n,i;
	 Scanner sc=new Scanner(System.in);
	 String arr[]=new String[20];
	 System.out.println("enter the size of array");
	 n=sc.nextInt();
	 sc=new Scanner(System.in);
	 System.out.println("enter the cities name");
	 for(i=0;i<n;i++)
	 {
		 arr[i]=sc.nextLine();
	 }
	 for(i=0;i<n;i++)
	 {
		 if(!(arr[i].startsWith("a")||arr[i].startsWith("e") || arr[i].startsWith("i") || arr[i].startsWith("o") || arr[i].startsWith("u") ))
		 {
			 if(arr[i].endsWith("a") || arr[i].endsWith("e") || arr[i].endsWith("i") || arr[i].endsWith("o") || arr[i].endsWith("u"))
			 {
				 System.out.println(arr[i]);
			 }
		 }
	 }
	}
}