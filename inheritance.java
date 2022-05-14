import java.util.Scanner;
class Number
{
	int n;
	void input(int n1)
	{
		n=n1;
	}
	void display()
	{
		System.out.println(n);
	}
}
	class Check extends Number
	{
		int fact=1,revnum=0;
		void find()
		{
			int n2=n;
			while(n2>=1)
			{
				fact=fact*n2;
				n2--;
			}
			System.out.println(fact);
		}
		void palindrome()
		{
			int n3=n,rem=0,sum=0;
			while(n3!=0)
			{
				rem=n3%10;
				sum=(sum*10)+rem;
				n3/=10;
			}
			if(n==sum)
			{
				System.out.println("number is palindrome");
			}
			else
			{
				System.out.println("number is not palindrome");
			}
		}
	public static void main(String[] args)
	{
		Check ob=new Check();
		ob.input(5);
		ob.display();
		ob.find();
		ob.palindrome();
	}
	
}
				
		