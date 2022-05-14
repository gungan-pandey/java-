import java.util.Scanner;
class abc
{
	public static void main(String[] arr)
	{
		double sum,rate,time,p;
		int ch;
		double SI,CI;
		Scanner sc=new Scanner(System.in);
		//sum=sc.nextDouble();
		rate=sc.nextDouble();
		time=sc.nextDouble();
		p=sc.nextDouble();
		System.out.println("1 for SI\n 2 for CI");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:
				SI=(rate*time*p)/100;
				System.out.println("simple interest:"+SI);
				break;
			case 2:
				CI =p*(Math.pow((1+rate)/100,time))-1;
				System.out.println("compund  interest:"+CI);
				break;
		}
	}
}
			  
		
		