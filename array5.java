import java.util.Scanner;
class abc
{
	public static void main(String[] arg)
	{
	 int n,sum=0,deviation=0;
	 int avg=0;
	 String  name[]=new String[20];
	 int totalmarks[]=new int[20];
	 
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the size of array");
	 n=sc.nextInt();
	 System.out.println("enter name and totalmarks");
	 for(int i=0;i<n;i++)
	 {
		sc=new Scanner(System.in);	  
		name[i]=sc.nextLine();
		totalmarks[i]=sc.nextInt();
	 }
	 System.out.println("average of the total marks obtained by n number of students");
	 for(int i=0;i<n;i++)
	 	 sum=sum+totalmarks[i];
		 
	 avg=sum/n;
	 System.out.println("average of the total marks obtained by n number of students" + avg);
	 for(int i=0;i<n;i++)
	 {
		 deviation=totalmarks[i]-avg;
		 System.out.println(deviation);
	 }
	}
}

	 