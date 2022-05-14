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


import java.util.Scanner;

 class Pin
{
public static void main(String[] args) {
int unit, tens, hundred, gratest, D = 10;
Scanner sc = new Scanner(System.in);
System.out.println("enter the first 3 digit number");
int n1 = sc.nextInt();

System.out.println("enter the second 3 digit number");
int n2 = sc.nextInt();

System.out.println("enter the third 3 digit number");
int n3 = sc.nextInt();

SmallestDigit ob1 = new SmallestDigit();
unit = ob1.smallestdigit(n1, n2, n3, D, 0);

tens = ob1.smallestdigit(n1, n2, n3, D * 10, 1);
hundred = ob1.smallestdigit(n1, n2, n3, D * 100, 2);
GratestDigit ob4 = new GratestDigit();
gratest = ob4.gratestdigit(n1, n2, n3);
System.out.println("pin=" + gratest + hundred + tens + unit);

    }
}

class SmallestDigit {
int smallestdigit(int n1, int n2, int n3, int D, int i) {

int a, b, c, smallest = 0;

        a = n1 % D;
        b = n2 % D;
        c = n3 % D;
if (i == 1) {
            a = a / 10;
            b = b / 10;
            c = c / 10;
        }
if (i == 2) {
            a = a / 100;
            b = b / 100;
            c = c / 100;
        }
if (a < b) {
if (c < a) {
smallest = c;
            } else {
smallest = a;
            }
        } else {
if (b < c) {
smallest = b;
            } else {
smallest = c;
            }
        }

return smallest;
    }
}

class GratestDigit {
int gratestdigit(int n1, int n2, int n3) {

int a, b, c, gratest = 0, gratest1 = 0, gratest2 = 0, gratest3 = 0, i, d = 10;

for (i = 1; i<= 3; i++) {

            a = n1 % d;
            b = n2 % d;
            c = n3 % d;
if (i == 2) {
                a = a / 10;
                b = b / 10;
                c = c / 10;
            }
if (i == 3) {
                a = a / 100;
                b = b / 100;
                c = c / 100;
            }
if (a > b) {
if (c > a) {
gratest = c;
                } else {
gratest = a;
                }
            } else {
if (b > c) {
gratest = b;
                } else {
gratest = c;
                }
            }
if (i == 1) {
                gratest1 = gratest;
            } else {
if (i == 2) {
                    gratest2 = gratest;
                } else {
                    gratest3 = gratest;
                }
            }
            d = d * 10;
        }
if (gratest1 > gratest2) {
if (gratest3 > gratest1) {
gratest = gratest3;
            } else {
gratest = gratest1;
            }
        }
else
 {
if (gratest2 > gratest3) {
gratest = gratest2;
            } else {
gratest = gratest3;
            }
        }
return gratest; 
}
}
























			
			
			