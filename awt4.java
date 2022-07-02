import java.awt.*;
import java.awt.event.*;

class awt4 extends Frame implements ActionListener
{
	TextField tf1,tf2;
	Button b1,b2,b3;
	
	awt4()
	{
		
		tf1=new TextField("gunjan",20);
		tf2=new TextField("mansi",20);
		b1=new Button("=========");
		b2=new Button("=========");
		b3=new Button("Submit");
		//b1.addActionListener(this);
		b3.addActionListener(this);
		
		add(tf1);
		add(tf2);
		add(b1);
		add(b2);
		add(b3);
		
		setSize(300,300);
		FlowLayout f=new FlowLayout(FlowLayout.LEFT);
		setLayout(f);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{		
		String s="Enter Something";
		String t1 = tf1.getText().trim();
		String t2 = tf2.getText().trim();
		
		if(t1.length()!=0 && t2.length()!=0)
		{
			if(!(t1.equals(s) || t2.equals(s)))
			{
				b1.setLabel(t1);
				b2.setLabel(t2);
			}
		}
		else 
		{
			if(t1.length()==0 || t1.equals(s))
				tf1.setText("Enter Something");
			if(t2.length()==0 || t2.equals(s))
				tf2.setText("Enter Something");
			
		}
	}
	public static void main(String [] ar)
	{
		new awt4();
	}
}