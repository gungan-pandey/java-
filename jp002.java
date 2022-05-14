import java.util.Scanner;

class abc
{
	public static void main(String[] arr)
	{
		int CP,SP;
		int pp=0,pr=0,los=0,lp=0;
		
	   Scanner sc= new Scanner(System.in);
	   System.out.println("enter the cost price");
	   CP=sc.nextInt();
	   System.out.println("enter the selling price");
	   SP=sc.nextInt();
	   
	   if(SP>CP)
	   {
			pr=SP-CP;
			pp=(pr*100)/CP;
			System.out.println("Profit : "+pr);
			System.out.println("Profit % : "+pp);
	   }
	   else if(CP>SP)
	   {
		    los=CP-SP;
			lp=(los*100)/CP;
			System.out.println("Loss : "+los);
			System.out.println("Loss % : "+lp);
	   }
	   else 
	   {
		   System.out.println("Neither profit nor loss");
	   }
	}
}
  