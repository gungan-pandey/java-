import java.awt.*;
import java.awt.event.*;

class awt extends Frame implements ActionListener,FocusListener,ItemListener
{
	Label l1,l2,l3,l4,l5,l6;
	TextField tf1,tf2;
	Checkbox cb1,cb2,cb3,cb4,cb5,cb6,cb7;
	CheckboxGroup cbg;
	List ls1;
	Choice ch1;
	Button b1;
	TextArea ta1;
	String gen=" ",msg=" ",edu=" ",city=" ";
	 String t1=" ",t2=" ";
	
	
	awt()
	{
		l1=new Label("Name");
		tf1=new TextField(20);
		tf1.addFocusListener(this);
		
		l2=new Label("Father name");
		tf2=new TextField(20);
		tf2.addFocusListener(this);
		
		cbg=new CheckboxGroup();
		l3=new Label("GENDEG");
		cb1=new Checkbox("male",false,cbg);
		cb1.addItemListener(this);
		
		cb2=new Checkbox("female",false,cbg);
		cb2.addItemListener(this);
		
		l3=new Label("hobby");
		cb3=new Checkbox("hb1",false);
		cb3.addItemListener(this);
		
		cb4=new Checkbox("hb2",false);
		cb4.addItemListener(this);
		
		cb5=new Checkbox("hb2",false);
		cb5.addItemListener(this);
		
		cb6=new Checkbox("hb3",false);
		cb6.addItemListener(this);
		
		cb7=new Checkbox("hb3",false);
		cb7.addItemListener(this);
		
		l4=new Label("education");
		ls1=new List(5);
		ls1.addItemListener(this);
		ls1.add("Select Education");
		ls1.add("Matric");
		ls1.add("Intermediate");
		ls1.add("Graduate");
		ls1.add("Post-Graduate");
		ls1.add("Doctorate");
		ls1.add("Post-Doctorate");
		
		l5=new Label("city");
		ch1=new Choice();
		ch1.addItemListener(this);
		ch1.add("Select City");
		ch1.add("Dehradun");
		ch1.add("Nainital");
		ch1.add("Mossoorie");
		ch1.add("Rurkee");
		ch1.add("Haldwani");
		ch1.add("Rudrapur");
	
		b1=new Button("button");
		b1.addActionListener(this);
		
		ta1=new TextArea();
		
		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		add(cb1);
		add(cb2);
		add(cb3);
		add(cb4);
		add(cb5);
		add(cb6);
		add(cb7);
		add(l4);
		add(ls1);
		add(l5);
		add(ch1);
		add(b1);
		add(ta1);
		
		
		setSize(300,300);
		FlowLayout f=new FlowLayout(FlowLayout.LEFT);
		setLayout(f);
		setVisible(true);
	}
		
		public void focusLost(FocusEvent fe)
		{
			if(fe.getSource()==tf1)
			{	
				t1=tf1.getText();
			}
			
			if(fe.getSource()==tf2)
			{
				t2=tf2.getText();
			}
		}
		
		public void focusGained(FocusEvent fe)
		{
				
		}
		
		public void itemStateChanged(ItemEvent ie)
		{
			if(ie.getSource()==cb1)
				if(cb1.getState())
					gen=cb1.getLabel();
			
			if(ie.getSource()==cb2)
				if(cb2.getState())
					gen=cb2.getLabel();
				
			if(ie.getSource()==cb3)
				if(cb3.getState())
					msg=msg+" "+cb3.getLabel();
				
			if(ie.getSource()==cb4)
				if(cb4.getState())
					msg=msg+" "+cb4.getLabel();
			
			if(ie.getSource()==cb5)
				if(cb5.getState())
					msg=msg+" "+cb5.getLabel();
				
			if(ie.getSource()==cb6)
				if(cb6.getState())
					msg=msg+" "+cb6.getLabel();
				
			if(ie.getSource()==ls1)
				edu=ls1.getSelectedItem();
				
			if(ie.getSource()==ch1)
				city=ch1.getSelectedItem();
		}
		
		public void actionPerformed(ActionEvent ae)
		{
			ta1.setText("");
			ta1.append(t1+"\n");
			ta1.append(t2+"\n");
			ta1.append(gen+"\n");
			ta1.append(msg+"\n");
			ta1.append(edu+"\n");
			ta1.append(city+"\n");
		}
			
			
	public static void main(String[] arr)
	{
		new awt();
	}
}	
	
	