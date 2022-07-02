import java.awt.*;
import java.awt.event.*;

class awt1 extends Frame implements ActionListener 
{
	TextField tf1,tf2,tf3;
	Label lab1,lab2,lab3;
	Button b1;
	
	awt1()
	{
		lab1=new Label("Enter a Number ");
		tf1=new TextField(20);
		lab2=new Label();
		lab2.setText("Enter a Number");
		tf2=new TextField(20);
		lab3=new Label("Addition ");
		tf3=new TextField(20);
		b1=new Button("Sum");
		b1.addActionListener(this);
		
		add(lab1);
		add(tf1);
		add(lab2);
		add(tf2);
		add(lab3);
		add(tf3);
		add(b1);
		
		setSize(300,300);
		FlowLayout fl=new FlowLayout(FlowLayout.LEFT);
		setLayout(fl);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		int a=Integer.parseInt(tf1.getText());
		int b=Integer.parseInt(tf2.getText());
		int c=a+b;
		tf3.setText(String.valueOf(c));
	}
	
	public static void main(String [] ar)
	{
		new awt1();
	}
}