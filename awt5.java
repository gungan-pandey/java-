import java.awt.*;
import java.awt.event.*;
 
class awt5 extends Frame implements ActionListener
{
	Label lab1;
	Button b1;
	Checkbox cb1,cb2,cb3;
	
	awt5()
	{
		lab1=new Label("Select Hobbies ");
		b1=new Button("Print");
		b1.addActionListener(this);
		
		cb1=new Checkbox("Playing Cricket");
		cb2=new Checkbox("Online Games",false);
		cb3=new Checkbox("Influencer",false);
		
		add(lab1);
		add(cb1);
		add(cb2);
		add(cb3);
		add(b1);
		
		setSize(300,300);
		FlowLayout f=new FlowLayout(FlowLayout.LEFT);
		setLayout(f);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String msg="";
		if(cb1.getState())
			msg=msg+" "+cb1.getLabel();
		if(cb2.getState())
			msg=msg+" "+cb2.getLabel();
		if(cb3.getState())
			msg=msg+" "+cb3.getLabel();
		
		System.out.println(msg);
	}
	public static void main(String [] ar)
	{
		new awt5();
	}
}
		