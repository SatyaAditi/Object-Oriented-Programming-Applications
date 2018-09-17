<<<<<<< HEAD
import java.awt.Graphics;
import java.awt.FontMetrics;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Test1 extends JPanel
{
	public static int count=0;
    public void paintComponent(Graphics g)
    {
	count=count+1;
	super.paintComponent( g );
	int width = getWidth();
	int height = getHeight();
	String str = String.format("width %d height %d %d",width,height,count);
	FontMetrics fm = g.getFontMetrics();
	Rectangle2D rect = fm.getStringBounds(str,g);
	width -= rect.getWidth();
	height -= rect.getHeight();
	g.drawString(str,width/2,height/2);
	
	
    }
  

    public static void main( String args[] )
    {
	Test1 panel = new Test1();
	JFrame application = new JFrame("Test1");
	application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	application.add(panel);
	application.setSize(200,200);
	application.setVisible(true);
	System.out.println(count);
    }
=======
import java.awt.Graphics;
import java.awt.FontMetrics;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Test1 extends JPanel
{
	public static int count=0;
    public void paintComponent(Graphics g)
    {
	count=count+1;
	super.paintComponent( g );
	int width = getWidth();
	int height = getHeight();
	String str = String.format("width %d height %d %d",width,height,count);
	FontMetrics fm = g.getFontMetrics();
	Rectangle2D rect = fm.getStringBounds(str,g);
	width -= rect.getWidth();
	height -= rect.getHeight();
	g.drawString(str,width/2,height/2);
	
	
    }
  

    public static void main( String args[] )
    {
	Test1 panel = new Test1();
	JFrame application = new JFrame("Test1");
	application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	application.add(panel);
	application.setSize(200,200);
	application.setVisible(true);
	System.out.println(count);
    }
>>>>>>> 19dc9b86e7dcb14ccc9c136575df973624ad7246
}