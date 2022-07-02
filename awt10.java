import java.awt.*;
import java.awt.event.*;

class awt extends Frame implements ActionListener
{
	TextField tf1;
	Button b1,b2;
	awt()
	{
		b1=new Button(" Button 1 ");
		b1.addActionListener(this);
		b2=new Button(" Button 2 ");
		b2.addActionListener(this);
		tf1=new TextField(20);
		
		add(tf1);
		add(b1);
		add(b2);
		
		setSize(300,300);
		FlowLayout f=new FlowLayout(FlowLayout.LEFT);
		setLayout(f);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		/*
		if(ae.getSource()==b1)
			System.out.println("Selected Text is "+tf1.getSelectedText());
		if(ae.getSource()==b2)
			tf1.select(0,5);
		*/
		
		/*
		if(ae.getSource()==b1)
			tf1.setEditable(false);
		if(ae.getSource()==b2)
			System.out.println("TextField is Editable or NOt "+tf1.isEditable());
		*/
		
		if(ae.getSource()==b1)
			tf1.setEchoChar('*');
		if(ae.getSource()==b2)
		{
			System.out.println("TextField is echoing or NOt "+tf1.echoCharIsSet());
			System.out.println("Text in TextField "+tf1.getText());
			System.out.println("Echo Char for this Field is : "+tf1.getEchoChar());
		}
	}
	
	public static void main(String[] arr)
	{
		new awt();
	}
}
		