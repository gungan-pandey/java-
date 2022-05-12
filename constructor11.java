import java.util.Scanner;
class Bill
{
	int bno;
	String name;
	int call;
	double amt;
	
	Bill()
	{
		bno=0;
		name="";
		call=0;
		amt=0;
	}
	
	Bill(int bno,String n,int noc)
	{
		this.bno=bno;
		name=n;
		call=noc;
	}
	
	void calculate()
	{
		if(call<=100)
			amt=call*0.60;
		else if(call>100 && call<=200)
			amt=(100*0.6)+((call-100)*0.8);
		else if(call>200&& call<=300)
			amt=(100*0.60)+(100*0.80)+((call-200)*1.20);
		else
			amt=(100*0.60)+(100*0.80)+(100*1.20)+((call-300)*1.50);
		
		System.out.println("Total Bill "+amt);
		amt+=125;
		System.out.println("Amount to Pay is : "+amt);
	}
	
	public static void main(String [] ar)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.nextLine();
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter bill no");
		int bno=sc1.nextInt();
		System.out.println(" enter no of calls  consumed");
		int call=sc1.nextInt();
		
		Bill obj;
		obj = new Bill();// calling for default constructor 
		obj = new Bill(bno,name,call);
		obj.calculate();
	}
}
		