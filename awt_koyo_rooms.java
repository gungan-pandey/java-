import java.awt.*;
import java.awt.event.*;

class awt extends Frame implements ActionListener
{
	TextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8;
	Label lab1,lab2,lab3,lab4,lab5,lab6,lab7,lab8,lab9;
	Button b1,b2,b3,b4;
	Checkbox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;
	CheckboxGroup cbg;
	
	awt()
	{
		lab1=new Label("Date checkIn");
		lab1.setBounds(50,50,100,20);
	
		tf1=new TextField(20);
		tf1.setBounds(150,50,100,20);
		
		lab2=new Label("Check out");
		lab2.setBounds(300,50,100,20);
		
		tf2=new TextField(20);
		tf2.setBounds(400,50,100,20);
		
		lab3=new Label("No. of Days");
		lab3.setBounds(50,100,100,20);
		
		tf3=new TextField(20);
		tf3.setBounds(150,100,100,20);
		
		b1=new Button("Button");
		b1.setBounds(250,100,100,20);
		
		lab4=new Label("No. of persons");
		lab4.setBounds(50,140,100,20);
		
		tf4=new TextField(20);
		tf4.setBounds(150,140,100,20); 
		
		lab5=new Label("room occupied");
		lab5.setBounds(50,210,100,20);
		
		tf5=new TextField(20);
		tf5.setBounds(150,210,100,20); 
		
		b2=new Button("Button");
		b2.setBounds(250,210,100,20);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		lab6=new Label("FACILITY");
		lab6.setBounds(300,260,100,20);
		
		c1=new Checkbox("Lunch",false);
		c1.setBounds(150,300,100,20);
		
		c2=new Checkbox("dinner",false);
		c2.setBounds(250,300,100,20);

		c3=new Checkbox("breakfast",false);
		c3.setBounds(350,300,100,20);
		
		c4=new Checkbox("car",false);
		c4.setBounds(150,340,100,20);
		
		
		c5=new Checkbox("spa",false);
		c5.setBounds(250,340,100,20);
		
		c6=new Checkbox("swimming pool",false);
		c6.setBounds(350,340,100,20);
		
		c7=new Checkbox("bar",false);
		c7.setBounds(250,380,100,20);
		
		cbg=new CheckboxGroup();
		c8=new Checkbox("general",false,cbg);
		c8.setBounds(50,400,100,20);
		
		c9=new Checkbox("student",false,cbg);
		c9.setBounds(150,400,100,20);
		
		c10=new Checkbox("staff",false,cbg);
		c10.setBounds(250,400,100,20);
		
		lab7=new Label("Total");
		lab7.setBounds(100,420,100,20);
		
		
		tf6=new TextField(20);
		tf6.setBounds(200,420,100,20);
		
		lab8=new Label("Discount");
		lab8.setBounds(100,460,100,20);
		
		tf7=new TextField(20);
		tf7.setBounds(200,460,100,20);
		
		lab9=new Label("Amount");
		lab9.setBounds(100,500,100,20);
		
		tf8=new TextField(20);
		tf8.setBounds(200,500,100,20);
		
		b3=new Button("calculate");
		b3.setBounds(250,540,100,20);
		
		b3.addActionListener(this);
		
		add(lab1);
		add(tf1);
		add(lab2);
		add(tf2);
		add(lab3);
		add(tf3);
		add(b1);
		add(lab4);
		add(tf4);
		add(lab5);
		add(tf5);
		add(b2);
		add(lab6);
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		add(c5);
		add(c6);
		add(c7);
		add(lab7);
		add(tf6);
		add(lab8);
		add(tf7);
		add(lab9);
		add(tf8);
		add(b3);
		add(c8);
		add(c9);
		add(c10);
		
		setSize(300,300);
		FlowLayout f=new FlowLayout(FlowLayout.LEFT);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int total=0,dis=0,amt=0;
		int a=0,b=0,c=0,d=0;
		if(ae.getSource()==b1)
		{
			a=Integer.parseInt(tf1.getText());
			b=Integer.parseInt(tf2.getText());
			c=b-a;
			tf3.setText(String.valueOf(c));
		}
		
		if(ae.getSource()==b2)
		{
			d=Integer.parseInt(tf4.getText());
			tf5.setText(String.valueOf(d/2.0));
		}
		
		if(ae.getSource()==b3)
		{
			d=Integer.parseInt(tf4.getText());
			total=(d/2)*1000;
			
			if(c1.getState())
				total+=200;
			if(c2.getState())
				total+=250;
			if(c3.getState())
				total+=150;
			if(c4.getState())
				total+=250;
			if(c5.getState())
				total+=500;
			if(c6.getState())
				total+=520;
			if(c7.getState())
				total+=1000;
			
			dis=total-(int)(total*10/100);
			amt=total-dis;
		
			tf6.setText(String.valueOf(total));
			tf7.setText(String.valueOf(dis));
			tf8.setText(String.valueOf(amt));
		}
	
	}
	public static void main(String[] arr)
	{
		new awt();
	}
}	
		
