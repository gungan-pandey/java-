import java.awt.*;
import java.awt.event.*;

class awt extends Frame implements ActionListener
{
	TextField tf1,tf2;
	Label l1,l2,l3,l4;
	List lis;
	Button b1,b2;
	Choice c1;
	
	awt()
	{
		l1=new Label("City");
		l1.setBounds(50,50,100,20);
		
		tf1=new TextField(20);
		tf1.setBounds(50,90,100,20);
		
		b1=new Button("->");
		b1.addActionListener(this);
		b1.setBounds(170,90,100,20);
		
		c1=new Choice();
		c1.setBounds(290,90,100,20);
		
		l2=new Label("education");
		l2.setBounds(50,130,100,20);
		
		tf2=new TextField(20);
		tf2.setBounds(50,170,100,20);
		
		b2=new Button("->");
		b2.addActionListener(this);
		b2.setBounds(170,170,100,20);
		
		lis=new List();
		lis.setBounds(290,170,100,20);
		
		
		
		add(l1);
		add(tf1);
		add(b1);
		add(c1);
		add(l2);
		add(tf2);
		add(b2);
		add(lis);
		
		setSize(300,300);
		FlowLayout flow=new FlowLayout(FlowLayout.LEFT);
		setLayout(null);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		
		if(ae.getSource()==b1)
		{
			String a=tf1.getText();
			tf1.setText("");
			c1.add(a);
		}
		if(ae.getSource()==b2)
		{
			String b=tf2.getText();
			tf2.setText(" ");
			lis.add(b);
		}
		
	}
	public static void main(String[] arr)
	{
		new awt();
	}
}
	
		
		
		
		