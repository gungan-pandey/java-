import java.awt.*;
import java.awt.event.*;

class awt extends Frame implements ActionListener
{
	Checkbox c1,c2,c3,c4,c5,c6,c7,c8,c9;
	CheckboxGroup cbg;
	Button b3;
	
	awt()
	{
		cbg=new CheckboxGroup();
		c1=new Checkbox("Lunch",false,cbg);
		c1.setBounds(150,300,100,20);
		
		c2=new Checkbox("dinner",cbg,false);
		c2.setBounds(250,300,100,20);

		c3=new Checkbox("breakfast",false,cbg);
		c3.setBounds(350,300,100,20);
		
		c4=new Checkbox("car",false,cbg);
		c4.setBounds(150,340,100,20);
		
		
		c5=new Checkbox("spa",false,cbg);
		c5.setBounds(250,340,100,20);
		
		c6=new Checkbox("swimming pool",false,cbg);
		c6.setBounds(350,340,100,20);
		
		c7=new Checkbox("bar",false,cbg);
		c7.setBounds(250,380,100,20);
		
		b3=new Button("calculate");
		b3.setBounds(250,540,100,20);
		
		b3.addActionListener(this);
		
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		add(c5);
		add(c6);
		add(c7);
		add(b3);
		
		setSize(300,300);
		FlowLayout f=new FlowLayout(FlowLayout.LEFT);
		setLayout(null);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(c1.getState())
			System.out.println(c1.getLabel());
		else if(c2.getState())
			System.out.println(c2.getLabel());
		else if(c3.getState())
			System.out.println(c3.getLabel());
		else if(c4.getState())
			System.out.println(c4.getLabel());
		else if(c5.getState())
			System.out.println(c5.getLabel());
		else if(c6.getState())
			System.out.println(c6.getLabel());
		else if(c7.getState())
			System.out.println(c7.getLabel());
		else 
			System.out.println("Please Check at least one option");
	}
	
	public static void main(String[] arr)
	{
		new awt();
	}
}	