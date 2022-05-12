/*
import java.util.Scanner;
class Fruitjuice
{
	int product_code;
	String flavour,pack_type;
	int pack_size,product_price;
	
	Fruitjuice(String f,String pack,int prod,int packs,int product)
	{
		flavour=f;
		pack_type=pack;
		product_code=prod;
		pack_size=packs;
		product_price=product;
		
	}
	void input()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter product code");
		product_code=s1.nextInt();
		System.out.println("enter pack_size");
		pack_size=s1.nextInt();
		System.out.println("enter product_price");
		product_price=s1.nextInt();
		Scanner s2=new Scanner(System.in);
		System.out.println("enter flavour ");
		flavour=s2.nextLine();
		System.out.println("enter pack_type");
		pack_type=s2.nextLine();
	}
	void discount()
	{
		product_price-=10;
	}
	void display()
	{
		System.out.println("product code"+product_code+"\t");
		System.out.println("pack_size"+pack_size+"ml"+"\t");
		System.out.println("product_price"+product_price);
		System.out.println("flavour"+flavour);
		System.out.println(" pack_type"+ pack_type);
	}
	public static void main(String[] main)
	{
		Fruitjuice ob=new Fruitjuice(" "," ",0,0,0);
		ob.input();
		ob.discount();
		ob.display();
	}
}
*/

import java.util.Scanner;
class Grade_Revision
{
	String name;
	int bas,expn;
	double inc,nbas;
	Grade_Revision()
	{
		name=" ";
		bas=0;
		expn=0;
		inc=0.0;
		nbas=0.0;
	}
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		name=sc.nextLine();
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter bas");
		bas=sc1.nextInt();
		System.out.println("enter expn");
		expn=sc1.nextInt();
	}
	void increment()
	{
		if(expn<3)
		{
			inc=1000+bas*10/100;
			System.out.println(inc);
		}
		else if(expn>=3 && expn<5)
		{
			inc=3000+bas*12/100;
			System.out.println(inc);
		}
		else if(expn>=5 && expn<10)
		{
			inc=5000+bas*15/100;
			System.out.println(inc);
		}
		else if(expn>=10)
		{
			inc=8000+bas*20/100;
			System.out.println(inc);
		}
	}
	void display()
	{
		System.out.println("enter name"+name);
		System.out.println("enter bas "+bas);
		System.out.println("enter expn"+expn);
		System.out.println("enter inc "+inc);
	}
	public static void main(String[] args)
	{
		Grade_Revision ob=new Grade_Revision();
		ob.accept();
		ob.increment();
		ob.display();
	}
}
	

		