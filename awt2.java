import java.awt.*;
import java.awt.event.*;

class awt1 extends Frame implements ActionListener
{
	TextField tf1,tf2,tf3,tf4,tf5;
	Button b1,b2,b3;
	
	awt1()
	{
		
		tf1=new TextField(20);
		tf2=new TextField(20);
		tf3=new TextField(20);
		tf4=new TextField(20);
		tf5=new TextField(20);
		b1=new Button("Sum");
		b2=new Button("subs");
		b3=new Button("mult");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		add(tf1);
		add(tf2);
		add(tf3);
		add(b1);
		add(tf4);
		add(b2);
		add(tf5);
		add(b3);
		
		setSize(300,300);
		FlowLayout fl=new FlowLayout(FlowLayout.LEFT);
		setLayout(fl);
		setVisible(true);
		}
	
	public void actionPerformed(ActionEvent ae)
	{
		int c=0;
		int a=Integer.parseInt(tf1.getText());
		int b=Integer.parseInt(tf2.getText());
		
		if(ae.getSource()==b1)
		{
			c=a+b;
			tf3.setText(String.valueOf(c));
		}
		if(ae.getSource()==b2)
		{
			c=(a>b)?a-b:b-a;
			tf4.setText(String.valueOf(c));
		}
		if(ae.getSource()==b3)
		{
			c=a*b;
			tf5.setText(String.valueOf(c));
		}
	}
	
	public static void main(String [] ar)
	{
		new awt1();
	}
}