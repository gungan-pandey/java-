import java.awt.*;
import java.awt.event.*;

class awt extends Frame implements ActionListener
{
	TextField tf1,tf2,tf3;
	Label l1,l2,l3,l4,l5;
	Checkbox cb1,cb2;
	Button b1;
	Choice c1,c2;
	CheckboxGroup cbg;
	TextArea ta1;
	
	
	awt()
	{
		l1=new Label("enter name");
		l1.setBounds(50,50,100,20);
		tf1=new TextField(20);
		tf1.setBounds(170,50,100,20);
		
		l2=new Label("enter father name");
		l2.setBounds(50,100,100,20);
		tf2=new TextField(20);
		tf2.setBounds(170,100,100,20);
		
		l3=new Label("enter class");
		l3.setBounds(50,150,100,20);
		tf3=new TextField(20);
		tf3.setBounds(170,150,100,20);
		
		l4=new Label("select gender");
		l4.setBounds(50,200,100,20);
		cbg=new CheckboxGroup();
		
		cb1=new Checkbox("male",false,cbg);
		cb1.setBounds(170,200,100,20);
		
		cb2=new Checkbox("female",false,cbg);
		cb2.setBounds(290,200,100,20);
		
		l5=new Label("select city");
		l5.setBounds(50,250,100,20);
		c1=new Choice();
		c1.setBounds(170,250,100,20);
		c1.add("Select city");
		c1.add("dehradun");
		c1.add("Nainital");
		c1.add("Mossoorie");
		c1.add("Rurkee");
		c1.add("Haldwani");
		c1.add("Rudrapur");
		
		ta1=new TextArea("information visible here",10,10,0);
		ta1.setBounds(50,300,300,200);
		
		b1=new Button("button");
		b1.setBounds(50,530,100,20);
		b1.addActionListener(this);
		
		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		add(l3);
		add(tf3);
		add(l4);
		add(cb1);
		add(cb2);
		add(c1);
		add(ta1);
		add(b1);
		
		setSize(300,300);
		setLayout(null);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		String a=tf1.getText();
		ta1.append(a);
		String b=tf2.getText();
		ta1.append("\n"+b);
		String c=tf3.getText();
		ta1.append("\n"+c);
		
		if(cb1.getState())
		{
			String x=cb1.getLabel();
			ta1.append("\n"+x);
		}
		else if(cb2.getState())
		{
			String y=cb2.getLabel();
			ta1.append("\n"+y);
		}
		
		String d=c1.getSelectedItem();
		ta1.append("\n"+d);
		
		
	}
	public static void main(String[] arr)
	{
		new awt();
	}
}