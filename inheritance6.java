import java.util.Scanner;
class Sale
{
	String title,author,publication;
	double price;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter title");
		title=sc.nextLine();
		System.out.println("enter author name");
		author=sc.nextLine();
		System.out.println("enter publication name");
		publication=sc.nextLine();
		System.out.println("enter price");
		price=sc.nextDouble();
	}
	void display()
	{
		System.out.println("title is :"+title);
		System.out.println("author is :"+author);
		System.out.println("publication is :"+publication);
	}
}
class Purchase extends Sale
{
	int noc,amount;
	void accept()
	{
		System.out.println("enter number of copy purchased");
		Scanner sc1=new Scanner(System.in);
		noc=sc1.nextInt();
	}
	void calculate()
	{
		amount=noc*(int)price;
	}
	void show()
	{
		System.out.println("number of copies purchased"+noc);
		System.out.println("amount to be paid"+amount);
	}
	public static void main(String[] args)
	{
		Purchase ob=new Purchase();
		ob.input();
		ob.accept();
		ob.calculate();
		ob.display();
		ob.show();
	}
}