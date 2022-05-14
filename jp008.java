import java.util.Scanner;
class student
{
	public static void main(String[] arr)
	{
		int Tcost=0;
		Scanner sc=new Scanner(System.in);
		int totalcost=sc.nextInt();
		if(totalcost<=2000)
		{
			Tcost=totalcost-(totalcost*5)/100;
			System.out.println("total cost"+Tcost);
			System.out.println("Calculator");
		}
		else if(totalcost>=2001 && totalcost<=5000)
		{
			Tcost=totalcost-(totalcost*10)/100;
			System.out.println("total cost"+ Tcost);
			System.out.println("School Bag");
		}	
		else if(totalcost>=5001 && totalcost<=10000)
		{
			Tcost=totalcost-(totalcost*15)/100;
			System.out.println("total cost" +Tcost);
			System.out.println("Wall Clock");
		}	
		else if(totalcost>10000)
		{
			Tcost=totalcost-(totalcost*20)/100;
			System.out.println("total cost" +Tcost);
			System.out.println("Wrist Watch");
		}	
	}
}