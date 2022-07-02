import java.awt.*;
import java.awt.event.*;

class awt extends Frame implements MouseListener
{
	awt()
	{
		addMouseListener(this);
		
		setSize(300,300);
		FlowLayout f=new FlowLayout(FlowLayout.LEFT);
		setLayout(f);
		setVisible(true);
		
	}
	public void mouseClicked(MouseEvent me)
	{
		setBackground(Color.red);
	}
	public void mouseEntered(MouseEvent me)
	{
		setBackground(Color.yellow);
	}
	public void mouseExited(MouseEvent me)
	{
		setBackground(Color.pink);
	}
	public void mousePressed(MouseEvent me)
	{
		setBackground(Color.green);
	}
	public void mouseReleased(MouseEvent me)
	{
		setBackground(Color.black);
	}
	public static void main(String[] arr)
	{
		new awt();
	}
}
