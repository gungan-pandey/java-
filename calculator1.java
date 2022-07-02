import java.awt.*;
import java.awt.event.*;


class awt extends Frame implements ActionListener
{
	TextField tf1;
	Button b1[],b2[];
	int a=0,b=0,c=0,d=0;
	int flag=0,count=0;
	String symb[]={"%","CE","C","<-","1/x","x2","rootx","/","*","-","+","="};
	awt()
	{
		setTitle("Calculator");
		tf1=new TextField(20);
		tf1.setBounds(50,50,250,150);
		
		add(tf1);
		int x=50,y=200;
		
		b2=new Button[symb.length];
		for(int i=0;i<symb.length;i++)
		{
			b2[i]=new Button(String.valueOf(symb[i]));
			b2[i].setBounds(x,y,50,50);
			b2[i].addActionListener(this);
			add(b2[i]);
			x+=50;
			if((i+1)%5==0)
			{
				y+=50;
				x=50;
			}
		}
		b1=new Button[10];
		y=350;
		x=50;
		for(int i=0;i<b1.length;i++)
		{
			
			b1[i]=new Button(String.valueOf(i));
			b1[i].setBounds(x,y,50,50);
			b1[i].addActionListener(this);
			add(b1[i]);
			x+=50;
			if((i+1)%5==0)
			{
				y+=50;
				x=50;
			}
		}
		
	
		setSize(400,y+20);
		//FlowLayout f=new FlowLayout(FlowLayout.LEFT);
		setLayout(null);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		
		for(int i=0;i<symb.length;i++)
		{
			if(ae.getSource()==b2[i] && b2[i].getLabel().trim().equals("+"))
			{
				a+=Integer.parseInt(tf1.getText());
				tf1.setText(String.valueOf(a));
				/* a=Integer.parseInt(tf1.getText());
				flag=1; */
				count=0;
				flag=1;
			}
			if(ae.getSource()==b2[i] && b2[i].getLabel().trim().equals("="))
			{
				b=Integer.parseInt(tf1.getText());
				tf1.setText("");
				
				if(flag==1)
					c=a+b;
				if(flag==2)
					c=a-b;
				if(flag==3)
					c=a*b;
				if(flag==4)
					c=a/b;
				if(flag==5)
					c=a%b;
				
				
				tf1.setText(String.valueOf(c));
			}
			if(ae.getSource()==b2[i] && b2[i].getLabel().trim().equals("-"))
			{
				a=Integer.parseInt(tf1.getText());
				tf1.setText("");
				flag=2;
			}
			if(ae.getSource()==b2[i] && b2[i].getLabel().trim().equals("*"))
			{
				a=Integer.parseInt(tf1.getText());
				tf1.setText("");
				flag=3;
			}
			if(ae.getSource()==b2[i] && b2[i].getLabel().trim().equals("/"))
			{
				a=Integer.parseInt(tf1.getText());
				tf1.setText("");
				flag=4;
			}
			if(ae.getSource()==b2[i] && b2[i].getLabel().trim().equals("C"))
			{
				a=Integer.parseInt(tf1.getText());
				a=0;
				count=0;
				flag=0;
				tf1.setText("");
			}
			if(ae.getSource()==b2[i] && b2[i].getLabel().trim().equals("%"))
			{
				a=Integer.parseInt(tf1.getText());
				tf1.setText("");
				flag=5;
			}
			if(ae.getSource()==b2[i] && b2[i].getLabel().trim().equals("CE"))
			{
				a=Integer.parseInt(tf1.getText());
				tf1.setText("");
			}
			if(ae.getSource()==b2[i] && b2[i].getLabel().trim().equals("x2"))
			{
				a=Integer.parseInt(tf1.getText());
				tf1.setText("");
				tf1.setText(String.valueOf(a*a));
			
			}
			if(ae.getSource()==b2[i] && b2[i].getLabel().trim().equals("rootx"))
			{
				a=Integer.parseInt(tf1.getText());
				tf1.setText("");
				tf1.setText(String.valueOf(Math.sqrt(a)));
			}
			if(ae.getSource()==b2[i] && b2[i].getLabel().trim().equals("<-"))
			{
				a=Integer.parseInt(tf1.getText());
				tf1.setText("");
				tf1.setText(String.valueOf(a/10));
			}
			if(ae.getSource()==b2[i] && b2[i].getLabel().trim().equals("1/x"))
			{
				a=Integer.parseInt(tf1.getText());
				tf1.setText("");
				tf1.setText(String.valueOf(1.0/a));
			}
		}
		for(int i=0;i<b1.length;i++)
		{
			if(ae.getSource()==b1[i])
			{
				if(flag==0)
					tf1.setText(tf1.getText()+b1[i].getLabel());
				else
				{
					if(count==0)
					{
						tf1.setText("");
						count++;
					}
					tf1.setText(tf1.getText()+b1[i].getLabel());
				}
				/*
				if(flag==0)
				{
					tf1.setText(tf1.getText()+b1[i].getLabel());
				}
				else if(flag==1)
				{
					int x=Integer.parseInt(tf1.getText());
					int y=Integer.parseInt(b1[i].getLabel());
					tf1.setText(String.valueOf(x+y));
					flag=0;
				} */
			}
		}
		
		
	}
	public static void main(String[] arr)
	{
		new awt();
	}
}	