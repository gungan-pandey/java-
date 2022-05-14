import java.util.Scanner;
class abc
{
	public static void main(String[] arr)
	{
		String s,s2="";
		String max="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		s=sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch!=' ')
				s2=s2+ch;
			else
			{
				if(max.length()<s2.length())
					max=s2;
				
				s2="";
			}
		}
		System.out.println(max+" : "+max.length());
	}
}
			
					
				