/*
import java.util.Scanner;
class Abc
{
	void manip(String str,int p)
	{
		if(p%2==0)
		{
			for(int i=0;i<str.length();i++)
			{
				char ch=str.charAt(i);
				if(i%2==0)
				{
					System.out.println(ch);
				}
			}
		}
		else
		{
			for(int i=0;i<str.length();i++)
			{
				char ch=str.charAt(i);
				if(i%2!=0)
				{
					System.out.println(ch);
				}
			}
		}
	}
	void manip(int a,char ch)
	{
		if(ch=='s')
		{
			int s=(int)Math.sqrt(a);
			System.out.println(s);
		}
		else
		{
			int c=(int)Math.cbrt(a);
			System.out.println(c);
		}
	}
	public static void main(String[] args)
	{
		Abc ob=new Abc();
		ob.manip("gunjan",2);
		ob.manip(27,'e');
	}
}
*/

class Student 
{
	introllno;
	String name;
	double sub1_marks,sub2_marks,sub3_marks,percentage;

	Student(introllno,String name)
	{
	this.rollno=rollno;
	this.name=name;
	}
	void setData(double sub1_marks,double sub2_marks,double sub3_marks)
	{
	this.sub1_marks=sub1_marks;
	this.sub2_marks=sub2_marks;
	this.sub3_marks=sub3_marks;
	}
	double getpercentage()
	{
	double sum=sub1_marks+sub2_marks+sub3_marks;
	percentage=sum/3;
	return percentage;
	}
	void showresult()
	{
	System.out.println("Rollno of student :"+rollno + " Name :"+name);
	System.out.println("Subject 1 marks:"+sub1_marks);
	System.out.println("Subject 2 marks:"+sub2_marks);
	System.out.println("Subject 3 marks:"+sub3_marks);
	System.out.println("Percentage:"+getpercentage());
	}
	}
	classTestResult
	{
	public static void main (String args[])
	{
		Student st1=new Student(57,"Gungan pandey");
		st1.setData(80,72,88);
		st1.showresult();
	}

	}


			
			
			