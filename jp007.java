import java.util.Scanner;
class student
{
	public static void main(String[] arr)
	{
			Scanner sc=new Scanner(System.in);
			String taxino;
			int distance,amount=0;
			System.out.println("enter the Taxi No:");
			taxino=sc.next(); //for taking String
			System.out.println("enter the distance:");
			distance=sc.nextInt();
			if(distance<=5)
				amount=100;
			else if(distance>5 && distance<=15)
				amount=(distance-5)*10+100;
			else if(distance>15 && distance<=25)
				amount=(distance-15)*8+200;
			else if(distance>25)
				amount=(distance-25)*5+280;
			System.out.println("Taxi No.:"+taxino);
			System.out.println("Distance Covered: "+distance);
			System.out.println("Amount:"+amount);
	}
}
			