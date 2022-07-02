import java.awt.*;
import java.awt.event.*;

class awt extends Frame implements ActionListener
{
	Label lb1,lb2;
	List ch1,ch2;
	String edu[]={"Select Education","Matric","Intermediate","Graduate","Post-Graduate","Doctorate","Post-Doctorate"};
	Button b1,b2;
	
	awt()
	{
		lb1=new Label("Choose City ");
		lb1.setBounds(50,50,100,20);
		ch1=new List(5);
		ch1.setBounds(170,50,100,100);
		ch1.add("Select City");
		ch1.add("Dehradun");
		ch1.add("Nainital");
		ch1.add("Mossoorie");
		ch1.add("Rurkee");
		ch1.add("Haldwani");
		ch1.add("Rudrapur");
		
		
		lb2=new Label("Choose Education ");
		lb2.setBounds(50,170,100,20);
		ch2=new List(5,true);
		ch2.setBounds(170,170,100,100);
		for(int i=0;i<edu.length;i++)
			ch2.add(edu[i]);
		
		b1=new Button("Print Values");
		b1.setBounds(90,130,100,20);
		b1.addActionListener(this);
		
		b2=new Button("reset");
		b2.setBounds(90,200,100,20);
		b2.addActionListener(this);
		
		add(lb1);
		add(ch1);
		add(lb2);
		add(ch2);
		add(b1);
		add(b2);
		
		
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			String a=ch1.getSelectedItem();
			System.out.println("Selected City is : "+a);
			
			System.out.println("Selected Education index & val is : ");
			String b[]=ch2.getSelectedItems();
			int y[]=ch2.getSelectedIndexes();
			
			for(int i=0;i<b.length;i++)
				System.out.println(y[i]+" "+b[i]);
			
			int x=ch1.getSelectedIndex();
			System.out.println("index :"+x);
			
			int z=ch1.getItemCount();
			System.out.println("count :"+z);
			
			int c=ch2.getItemCount();
			System.out.println("count:"+c);
			
			String  d=ch1.getItem(4);
			System.out.println("item :"+d);
			String e=ch2.getItem(4);
			System.out.println("item "+e);
		}
		if(ae.getSource()==b2)
		{
			ch1.select(0);
			ch2.select(0);
		}
		
	}
	
	public static void main(String[] arr)
	{
		new awt();
	}
}	