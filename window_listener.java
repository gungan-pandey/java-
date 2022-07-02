import java.awt.*;
import java.awt.event.*;

class awt extends Frame implements WindowListener
{
	//TextField tf1,tf2;
	
	awt()
	{
		addWindowListener(this);
		
		setSize(300,300);
		FlowLayout f=new FlowLayout(FlowLayout.LEFT);
		setLayout(f);
		setVisible(true);
	}
	public void windowActivated(WindowEvent we)
	{
	}
	public void windowClosed(WindowEvent we)
	{
	}
	public void windowClosing(WindowEvent we)
	{
			System.exit(1);
	}
	public void windowDeactivated(WindowEvent we)
	{
		
	}
	public void windowDeiconified(WindowEvent we)
	{
	}
	public void windowIconified(WindowEvent we)
	{
	}
	public void windowOpened(WindowEvent we)
	{
	}
	public static void main(String[] arr)
	{
		new awt();
	}
}
		
		