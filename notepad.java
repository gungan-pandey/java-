import java.awt.*;
import java.awt.event.*;

class awt extends Frame implements ActionListener
{
	MenuBar mb;
	Menu m1,m2,m3,m4,m5;
	MenuItem mi1,mi2,mi3,mi4,mi5,mi6,mi7,mi8,mi9,mi10,mi11,mi12,mi13,mi14;
	TextArea ta1;
	
	awt()
	{
		setTitle("notepad");
		ta1=new TextArea();
		add(ta1);
		
		mb=new MenuBar();
		setMenuBar(mb);
		
		m1=new Menu("File");
		m2=new Menu("Edit");
		m3=new Menu("Format");
		m4=new Menu("View");
		m5=new Menu("Help");
		
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		mb.add(m4);
		mb.add(m5);

		mi1=new MenuItem("New");
		mi1.addActionListener(this);
		mi2=new MenuItem("Open");
		mi2.addActionListener(this);
		
		mi3=new MenuItem("Save");
		mi3.addActionListener(this);
		mi4=new MenuItem("Save as");
		mi4.addActionListener(this);
		
		m1.add(mi1);
		m1.add(mi2);
		m1.add(mi3);
		m1.add(mi4);
		
		mi5=new MenuItem("cut");
		mi5.addActionListener(this);
		
		mi6=new MenuItem("copy");
		mi6.addActionListener(this);
		
		mi7=new MenuItem("Paste");
		mi7.addActionListener(this);
		
		mi8=new MenuItem("Delete");
		mi8.addActionListener(this);
		
		m2.add(mi5);
		m2.add(mi6);
		m2.add(mi7);
		m2.add(mi8);
		
		mi9=new MenuItem("Word Wrap");
		mi9.addActionListener(this);
		
		mi10=new MenuItem("Font...");
		mi10.addActionListener(this);
		
		mi11=new MenuItem("Status ");
		mi11.addActionListener(this);
		
		m3.add(mi9);
		m3.add(mi10);
		m4.add(mi11);
		
		//mi8=new MenuItem("Delete");
		//mi8.addActionListener(this);
		
		setSize(300,300);
		setVisible(true);
		
		
	}
	public void actionPerformed(ActionEvent ae)
	{
	}
	public static void main(String[] ae)
	{
		new awt();
	}
}
	
		