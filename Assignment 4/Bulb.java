import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.util.ArrayList;
class Object1
{
    double px, py;
    int radius;
    double mass;
    Color color;
    Object1()
    {
	color = new Color(255,0,0);
	set_position(50,50);
	set_radius(17);
    }
    Object1(double px, double py, Color color)
    {
	this.color = color;
	set_position(px,py);
	set_radius(17);
    }

    void set_position(double px, double py)
    {
	this.px = px;
	this.py = py;
    }
    
    void set_radius(int r)
    {
	radius = r;
	mass = r*r;
    }

    public String toString()
    {
	String str = "("+px+", "+py+") " + color;
	return str;
    }
    
    
    public void draw(Graphics g) 
    {
	g.setColor(color);
	g.fillOval((int)(px-radius), (int) (py-radius), (int)2*radius, (int)2*radius);

        g.setColor(color);
	g.fillOval((int)(px-radius), (int) (py-radius), (int)2*radius, (int)2*radius);

	g.setColor(color);
	g.fillOval((int)(px-radius), (int) (py-radius), (int)2*radius, (int)2*radius);
    }

    
}

public class Bulb extends JPanel
{
    ArrayList<Object1> balls = new ArrayList<Object1>();

    Bulb()
    {
	balls.add(new Object1(50,50,Color.RED));
	balls.add(new Object1(50,90,Color.GREEN));
	balls.add(new Object1(50,130,Color.YELLOW));		
	for (Object b: balls) System.out.println(b);
    }
    public void paintComponent(Graphics g)
    {
	
	super.paintComponent( g );
	this.setBackground(Color.PINK);
	for (Object1 b: balls) b.draw(g);
	for (Object1 b: balls) b.draw(g);
	} 
    

    public static void main(String args[] )
    {
	Bulb panel = new Bulb();
	JFrame application = new JFrame("Emoticans");
	application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	application.add(panel);
	application.setSize(200,200);
	application.setVisible(true);
    }
}