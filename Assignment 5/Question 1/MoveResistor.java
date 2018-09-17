import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/*class Resistor
{
public static double a;
   int width, height;
   double value;
   String name;
public Resistor()
{
}
public Resistor(String x)
{ 
a=Double.parseDouble(x);
  }}*/
public class MoveResistor extends JPanel implements ActionListener {
	String name;
	
	double angle=45;
	int x = 100,y=100,n;
	private JButton left;
	private JButton right;
	private JButton rotate;
	
	//Resistor dr =new Resistor();
	//static ArrayList<Resistor> list = new ArrayList<Resistor>();
	
	
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2d =(Graphics2D) g;
		
		 AffineTransform saveTransform = g2d.getTransform();
		 AffineTransform AT = new AffineTransform();
		
		  
		 AT.rotate(Math.toRadians(angle),x,y);
		 g2d.setTransform(AT);
		
		g2d.setColor(Color.green);
		
		int xxpoints[]={x-45,x-35,x-25,x-15,x-5,x+5,x+15,x+25,x+35,x+45};
		int yypoints[]={y,y+10,y-20,y+20,y-20,y+20,y-20,y+20,y-20,y};
		int npoints=10;
		 g2d.setStroke(new BasicStroke(4.0f)); 
		 g2d.drawPolyline(xxpoints, yypoints, npoints);
		 g2d.setTransform(saveTransform);
		
		 
		 
	}
	public void actionPerformed(ActionEvent e){
		System.out.println(e.getActionCommand());
		if(e.getSource()==left)
			goleft();
		if(e.getSource()==right)
			goright();
		if(e.getSource()==rotate)
			gorotate();
		repaint();
		
		
	}
public void goleft(){
		
		x=x-10;
		//x+=LL;
		System.out.println("left");
		
	}
	public void goright(){
		x=x+10;
	}
	
	public void gorotate(){
		angle=angle+45;
	}
	public MoveResistor (){
		//setLayout(null);
		
		//Mypanel =new Mypanel();
		left=new JButton("Left");
		left.setBounds(100, 50, 100, 30);
		left.addActionListener(this);
		
		right=new JButton("Right");
		right.setBounds(200, 50, 100, 30);
		right.addActionListener(this);
		
		rotate=new JButton("Rotate");
		rotate.setBounds(400, 50, 100, 30);
		rotate.addActionListener(this);
		add(left);
		add(right);
		add(rotate);
		
	}
public static void main(String args[])
{
MoveResistor l=new MoveResistor();
JFrame application = new JFrame("Resistor");
	application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	application.add(l);
	application.setSize(200,200);
	application.setVisible(true);
       
}

	
}

