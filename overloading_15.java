import java.util.Scanner;
class Area
{
	int base,ht,a;
	void area()
	{
		Scanner sc=new Scanner(System.in);
		base=sc.nextInt();
		ht=sc.nextInt();
		a=base*ht;
		System.out.println("area of a parallelogram "+a);
	}
	void area(int d1,int d2)
	{
		a=(int)((1.0/2.0)*d1*d2);
		System.out.println("area of a rhombus "+a);
	}
	void area(int c,int b,int h)
	{
		a=(int)((1.0/2.0)*(c+b)*h);
		System.out.println("area of a trapezium "+a);
	}
	public static void main(String[] args)
	{
		Area ob=new Area();
		ob.area();
		ob.area(4,5);
		ob.area(2,3,4);
	}
}
		