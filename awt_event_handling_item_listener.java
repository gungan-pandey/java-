import java.awt.*;
import java.awt.event.*;

class awt extends Frame implements ItemListener
{
	Checkbox cb1,cb2;
	//CheckboxGroup cbg;
	
	awt()
	{
		//cbg=new CheckboxGroup();
		
		cb1=new Checkbox("gunjan",false);
		cb1.addItemListener(this);
		
		cb2=new Checkbox("pawni",false);
		cb2.addItemListener(this);
		
		add(cb1);
		add(cb2);
		
		setSize(300,300);
		FlowLayout f=new FlowLayout(FlowLayout.LEFT);
		setLayout(f);
		setVisible(true);
	}
	public void itemStateChanged(ItemEvent ae)
	{
		if(ae.getSource()==cb1)
			if(cb1.getState())
				System.out.println("gunjan" +cb1.getState());
		if(ae.getSource()==cb2)
			System.out.println("gunjan" +cb2.getState());
	}
	public static void main(String[] arr)
	{
		new awt();
	}
}
		