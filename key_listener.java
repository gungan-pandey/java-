import java.awt.*;
import java.awt.event.*;

class awt extends Frame implements KeyListener
{
	TextField tf1,tf2;
	
	awt()
	{
		tf1=new TextField(20);
		//tf1.addTextListener(this);
		tf1.addKeyListener(this);
		
		tf2=new TextField(20);
		
		add(tf1);
		add(tf2);
		
		setSize(300,300);
		FlowLayout f=new FlowLayout(FlowLayout.LEFT);
		setLayout(f);
		setVisible(true);
	}
	public void keyPressed(KeyEvent ke)
	{
		//tf2.setText("you pressed");
	}
	public void keyReleased(KeyEvent ke)
	{
		//tf2.setText("you released");
	}
	public void keyTyped(KeyEvent ke)
	{
		tf2.setText("you are typing");
	}
	public static void main(String[] arr)
	{
		new awt();
	}
}
	
	