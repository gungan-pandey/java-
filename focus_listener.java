import java.awt.*;
import java.awt.event.*;

class awt extends Frame implements FocusListener
{
	TextField tf1,tf2;
	
	awt()
	{
		tf1=new TextField(20);
		tf1.addFocusListener(this);
		
		tf2=new TextField(20);
		//tf2.addFocusListener(this);
		
		add(tf1);
		add(tf2);
		
		setSize(300,300);
		FlowLayout f=new FlowLayout(FlowLayout.LEFT);
		setLayout(f);
		setVisible(true);
	}
	public void focusLost(FocusEvent fe)
	{
		System.out.println("focus Lost");	
	}
	public void focusGained(FocusEvent fe)
	{
			System.out.println("focus gained");
	}
	public static void main(String[] arr)
	{
		new awt();
	}
}