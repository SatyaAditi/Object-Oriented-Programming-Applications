import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.Timer;
import java.util.ArrayList;
import java.awt.*;


 class Panel3 extends JPanel
{
    ArrayList<Object1> balls = new ArrayList<Object1>();
    private Timer myTimer;
    Panel3()
    {
	balls.add(new Object1(50,50,Color.RED));
	balls.add(new Object1(50,90,Color.GREEN));
	balls.add(new Object1(50,130,Color.YELLOW));		
	for (Object b: balls) System.out.println(b);
    }
    

    public void rotate(Object1 b, double angle)
    {
	double x = b.px - 135;
	double y = b.py - 75;
	double phi = angle*Math.PI/180.0;
	double ct = Math.cos(phi);
	double st = Math.sin(phi);
	b.set_position(ct*x-st*y+135,st*x+ct*y+75);
    }
    
    public void startAnimation()
    {
	if (myTimer == null)
	{
	    myTimer = new Timer(50,new TimerHandler() );
	    myTimer.start();
	}
	else if (!myTimer.isRunning()) myTimer.restart();
    }
    
    public void stopAnimation()
    {
	myTimer.stop();
    }
	
    private class TimerHandler implements ActionListener
    {
	public void actionPerformed(ActionEvent actionevent)
	{
	   Object1 b = balls.get(1);
	    rotate(b,3);
	    repaint();
	}
	
    }
   public void paintComponent(Graphics g)
    {
	
	super.paintComponent( g );
	for (Object1 b: balls) b.draw(g);
	//for (Object1 b: balls) b.draw(g);
}
	 
}

 class Animation
{
    Panel3 panel;

    public static void main(String args[])
    {
	Panel3 panel = new Panel3();
	JFrame application = new JFrame("Moving Bulb");
	application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	application.add(panel);
	application.setSize(400,400);
	application.setVisible(true);
	panel.startAnimation();
    }
}