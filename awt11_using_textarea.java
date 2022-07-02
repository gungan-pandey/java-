import java.awt.*;
import  java.awt.event.*;

class awt extends Frame implements ActionListener
{
	TextArea ta1,ta2,ta3,ta4,ta5;
	Button b1,b2,b3;
	
	awt()
	{
		ta1=new TextArea();
		b1=new Button("b1");
		b1.addActionListener(this);
		ta2=new TextArea(9,9);
		ta3=new TextArea("enter about yourself");
		ta4=new TextArea("give review ",7,9);
		ta5=new TextArea("give review",9,9,3);
		b2=new Button("b2");
		b2.addActionListener(this);
		b3=new Button("b3");
		b3.addActionListener(this);
		
		add(ta1);
		add(b1);
		add(ta2);
		add(b2);
		add(ta3);
		add(b3);
		add(ta4);
		add(ta5);
		
		
		
		setSize(300,300);
		FlowLayout f=new FlowLayout(FlowLayout.LEFT);
		setLayout(f);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		    ta1.append("hello how are you");
		if(ae.getSource()==b2)
			ta1.insert("gunjan",4);
		if(ae.getSource()==b3)
			ta1.replaceRange("mansi",3,8);
	}
	public static void main(String[] arr)
	{
		new awt();
	}
}