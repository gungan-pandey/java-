import java.util.Scanner;
class Hcflcm
{
		int a,b,c=0,lcm=0;		
		void calculate(int x,int y)
		{
			a=x;
			b=y;
			
			for(int i=1;i<a && i<b ;i++)
			{
				if(a%i==0 && b%i==0)
					c=i;
			}
		    System.out.println("hcf :"+c);
			lcm=(a*b)/c;
			System.out.println("lcm :"+lcm);
		}
		public static void main(String[] args)
		{
		 Hcflcm ob1=new Hcflcm();
		 ob1.calculate(12,8);
		}
}

		
		