import java.awt.*;
import java.awt.event.*;

class awt extends Frame implements ActionListener
{
	MenuBar mb;
	Menu m1,m2,m3;
	MenuItem mi1, mi2, mi3, mi4;
	FileDialog fd1,fd2;
	TextArea ta1;
	
	awt()
	{
		ta1=new TextArea();
		add(ta1);
		
		mb=new MenuBar();
		setMenuBar(mb);
		
		m1=new Menu("File");
		m2=new Menu("Edit");
		m3=new Menu("Windows");
		
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		
		mi1=new MenuItem("Open");
		mi1.addActionListener(this);
		mi2=new MenuItem("Save");
		mi2.addActionListener(this);
		mi3=new MenuItem("Exit");
		mi3.addActionListener(this);
		
		fd1=new FileDialog(this,"open file",FileDialog.LOAD);
		fd2=new FileDialog(this,"open file",FileDialog.SAVE);
		
		m1.add(mi1);
		m1.add(mi2);
		m1.add(mi3);
		
		setSize(300,300);
		//setLayout(new FlowLayout(FlowLayout.LEFT));
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==mi1)
		{
			System.out.println("This is Open ");
			fd1.show();
		}
		if(ae.getSource()==mi2)
		{	
			System.out.println("This is Save ");
			fd2.show();
		}
		if(ae.getSource()==mi3)
			System.out.println("This is Exit ");
		
		
	}
	public static void main(String[] arr)
	{
		new awt();
	}
}