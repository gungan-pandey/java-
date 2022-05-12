import java.util.Scanner;

class Quad
{
	float a,b,c,d,r1,r2;
	Quad(int x,int y, int z)
	{
		a=x;
		b=y;
		c=z;
		d=0;
	}
	
	void calculate()
	{
		 d=b*b-4*a*c;
		 System.out.println("d :"+ d);
		 if(d<0)
		 {
			 System.out.println("root not possible");
		 }
		 else
		 {
			 r1=(-b+(float)Math.sqrt(d))/2*a;
			 r2=(-b-(float)Math.sqrt(d))/2*a;
		 }
		 System.out.println("r1 :"+ r1);
		 System.out.println("r2 :"+ r2);
	 }
	 public static void main(String[] args)
	 {
		 Quad ob=new Quad(34,12,6);
		 ob.calculate();
	 }
}
	