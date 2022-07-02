import java.awt.*;
import java.awt.event.*;

class awt3 extends Frame implements ActionListener
{
	Button b1,b2;
	Label lab1,lab2,lab3;
	
	awt3()
	{
		b1=new Button("gunjan");
		b2=new Button("mansi");
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		add(b1);
		add(b2);
		
		setSize(300,300);
		FlowLayout flow=new FlowLayout(FlowLayout.LEFT);
		setLayout(flow);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String tmp=b1.getLabel();
		b1.setLabel(b2.getLabel());
		b2.setLabel(tmp);
	}
	public static void main(String [] ar)
	{
		new awt3();
	}
}