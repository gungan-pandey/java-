import java.awt.*;
import java.awt.event.*;

class awt extends Frame implements ActionListener
{
	Label lb1,lb2;
	Choice ch1,ch2;
	String edu[]={"Select Education","Matric","Intermediate","Graduate","Post-Graduate","Doctorate","Post-Doctorate"};
	Button b1;
	
	awt()
	{
		lb1=new Label("Choose City ");
		lb1.setBounds(50,50,100,20);
		ch1=new Choice();
		ch1.setBounds(170,50,100,20);
		ch1.add("Select City");
		ch1.add("Dehradun");
		ch1.add("Nainital");
		ch1.add("Mossoorie");
		ch1.add("Rurkee");
		ch1.add("Haldwani");
		ch1.add("Rudrapur");
		
		
		lb2=new Label("Choose Education ");
		lb2.setBounds(50,90,100,20);
		ch2=new Choice();
		ch2.setBounds(170,90,100,20);
		for(int i=0;i<edu.length;i++)
			ch2.add(edu[i]);
		
		b1=new Button("Print Values");
		b1.setBounds(90,130,100,20);
		b1.addActionListener(this);
		
		add(lb1);
		add(ch1);
		add(lb2);
		add(ch2);
		add(b1);
		
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String a=ch1.getSelectedItem();
		System.out.println("Selected City is : "+a);
		String b=ch2.getSelectedItem();
		System.out.println("Selected Education is : "+b);
		
		int x=ch1.getSelectedIndex();
		System.out.println("index :"+x);
		int y=ch2.getSelectedIndex();
		System.out.println("index :"+y);
		
		int z=ch1.getItemCount();
		System.out.println("count :"+z);
		
		int c=ch2.getItemCount();
		System.out.println("count:"+c);
		
		String  d=ch1.getItem(4);
		System.out.println("item :"+d);
		String e=ch2.getItem(4);
		System.out.println("item "+e);
		
		
		}
	
	public static void main(String[] arr)
	{
		new awt();
	}
}	