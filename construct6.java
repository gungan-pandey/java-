
/*
import java.util.Scanner;
class Population
{
	float p,r;
	Population(int a,int b)
	{
		p=a;
		r=b;
	}
	void print()
	{
		float c;
		for(int i=2000;i<2007;i++)
		{
			c=p*(1+r/100);
			p+=c;
			System.out.println("Population in "+i+" "+p);
		}
	}
	
	public static void main(String[] arr)
	{
			Population ob=new Population(2000,5);
			ob.print();
	}
}
*/

/*
import java.util.Scanner;
class Laptop
{
	int price,dis,amt;
	String name;
	
	Laptop(String name,int price)
	{
		this.name=name;
		this.price=price;
		amt=0;
		dis=0;
	}
	void discount()
	{
		if(price<=25000)
			dis=price-(int)(price*5)/100;
		else if(price>25000 && price<=50000)
			dis=price-(int)(price*7.5)/100;
		else if(price>=50001 && price<=100000)
			dis=price-(int)(price*10.0)/100;
		else 
			dis=price-(int)(price*15.0)/100;
		
		amt=price-dis;
	}
	void display()
	{
		System.out.println("Name of the Customer : "+name);
		System.out.println("Original Amount : "+price);
		System.out.println("Discount"+dis);
		System.out.println("Amount After discount : "+price);
	}
	public static void main(String[] arr)
	{
		Laptop ob=new Laptop("Gungun Pandey",37500);
		ob.discount();
		ob.display();
	}
}
*/

/*
import java.util.Scanner;
class Calculate
{
	int num,f,rev,count=0;
	Calculate(int n)
	{
		num=n;
		f=0;
		rev=0;
	}
	int prime()
	{
		for(int i=2;i<num/2;i++)
		{
			
			if(num%i==0)
			{
				count=1;
				break;
			}
		}
		return count;
	}
	int reverse()
	{
		int rem=0,sum=0;
		int temp=num;
		while(temp!=0)
		{
			rem=temp%10;
			sum=(sum*10)+rem;
			temp=temp/10;
			
		}
		return sum;
	}
	void display()
	{
		if(prime()==0 && reverse()==num)
			System.out.println("prime palindrome");
		else if(prime()!=0 && reverse()==num)
			System.out.println("not prime but palindrome");
		else if(prime()==0 && reverse()!=num)
			System.out.println("prime but not palindrome");
		else
			System.out.println(" not prime  not palindrome");
	}
	public static void main(String[] arr)
	{
		Calculate ob=new Calculate(132);
		ob.prime();
		ob.reverse();
		ob.display();
	}
}

*/

import java.util.Scanner;
class Arrange
{
		String str,str2="";
		int i,p;
		char ch;
		
		Arrange(String x)
		{
			str=x;
			ch=' ';
			i=0;
			p=0;
		}
		
		void arrange()
		{
			str=str.toLowerCase();
			for(char ch='a';ch<='z';ch++)
			{
				for(i=0;i<str.length();i++)
				{
					if(ch==str.charAt(i))
						 str2+=ch;
				}
			}
		}
		
		void display()
		{
			System.out.println("Output : "+str2);
		}
		
		public static void main(String[] args)
		{
			Arrange ob=new Arrange("gunjan pandey");
			ob.arrange();
			ob.display();
		}
}

		
		
				
			

	
			