import java.awt.*;
import java.awt.event.*;

class awt extends Frame implements ActionListener
{
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30;
	TextField tf1;
	awt()
	{
		tf1=new TextField(20);
		tf1.setBounds(50,100,300,100);
		
		b1=new Button("MC");
		b1.addActionListener(this);
		b1.setBounds(50,230,70,50);
		
		b2=new Button("MR");
		b2.addActionListener(this);
		b2.setBounds(120,230,70,50);
		
		b3=new Button("M+");
		b3.addActionListener(this);
		b3.setBounds(190,230,70,50);
		
		b4=new Button("M-");
		b4.addActionListener(this);
		b4.setBounds(260,230,70,50);
		
		b5=new Button("MS");
		b5.addActionListener(this);
		b5.setBounds(330,230,70,50);
		
		b6=new Button("%");
		b6.addActionListener(this);
		b6.setBounds(50,280,100,50);
		
		b7=new Button("CE");
		b7.addActionListener(this);
		b7.setBounds(150,280,100,50);
		
		b8=new Button("C");
		b8.addActionListener(this);
		b8.setBounds(250,280,100,50);
		
		b9=new Button("..");
		b9.addActionListener(this);
		b9.setBounds(350,280,100,50);
		
		b10=new Button("..");
		b10.addActionListener(this);
		b10.setBounds(50,330,100,50);
		
		b11=new Button("..");
		b11.addActionListener(this);
		b11.setBounds(150,330,100,50);
		
		b12=new Button("..");
		b12.addActionListener(this);
		b12.setBounds(250,330,100,50);
		
		b13=new Button("/");
		b13.addActionListener(this);
		b13.setBounds(350,330,100,50);
		
		b14=new Button("7");
		b14.addActionListener(this);
		b14.setBounds(50,380,100,50);
		
		b15=new Button("8");
		b15.addActionListener(this);
		b15.setBounds(150,380,100,50);
		
		b16=new Button("9");
		b16.addActionListener(this);
		b16.setBounds(250,380,100,50);
		
		b29=new Button("*");
		b29.addActionListener(this);
		b29.setBounds(350,380,100,50);
		
		b17=new Button("4");
		b17.addActionListener(this);
		b17.setBounds(50,420,100,50);
		
		b18=new Button("5");
		b18.addActionListener(this);
		b18.setBounds(150,420,100,50);
		
		b19=new Button("6");
		b19.addActionListener(this);
		b19.setBounds(250,420,100,50);
		
		b30=new Button("-");
		b30.addActionListener(this);
		b30.setBounds(350,420,100,50);
		
		b20=new Button("1");
		b20.addActionListener(this);
		b20.setBounds(50,480,100,50);
		
		b21=new Button("2");
		b21.addActionListener(this);
		b21.setBounds(150,480,100,50);
		
		b22=new Button("3");
		b22.addActionListener(this);
		b22.setBounds(250,480,100,50);
		
		b23=new Button("+");
		b23.addActionListener(this);
		b23.setBounds(350,480,100,50);
		
		b24=new Button("..");
		b24.addActionListener(this);
		b24.setBounds(50,520,100,50);
		
		b25=new Button("0");
		b25.addActionListener(this);
		b25.setBounds(150,520,100,50);
		
		
		b26=new Button(".");
		b26.addActionListener(this);
		b26.setBounds(250,520,100,50);
		
		b27=new Button("=");
		b27.addActionListener(this);
		b27.setBounds(350,520,100,50);
		
		add(tf1);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b10);
		add(b11);
		add(b12);
		add(b13);
		add(b14);
		add(b15);
		add(b16);
		add(b29);
		add(b17);
		add(b18);
		add(b19);
		add(b30);
		add(b20);
		add(b21);
		add(b22);
		add(b23);
		add(b24);
		add(b25);
		add(b26);
		add(b27);
		
		
		setSize(300,300);
		//FlowLayout f=new FlowLayout(FlowLayout.LEFT);
		setLayout(null);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
	}
	public static void main(String[] arr)
	{
		new awt();
	}
}	