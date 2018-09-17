import java.awt.*;
import java.awt.geom.AffineTransform;
public class Resistor {
    public static Double a;
 int x1,y1,x2,y2,x3,y3;
     String iR, Name;
     int start_node, end_node, rX, rY;
     double Value,angle;
    Color c;
public Resistor()
{
}
public Resistor(String x)
{ 
a=Double.parseDouble(x);
  }
    public Resistor(String iR, String Name, int start_node, int end_node, double Value, int rX, int rY, double angle) {
        this.iR = iR;
        this.Name = Name;
        this.start_node = start_node;
        this.end_node = end_node;
        this.rX = rX;
        this.rY = rY;
        this.Value = Value;
        this.angle = angle;
        
    }

    public String toString() {
    	return Name + " " + rX + " " + rY;
    }

    public Resistor(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }
    
   

    void draw(Graphics g) {
        g.setColor(c);
        int x = rX;
        int y = rY;
       g.setColor(Color.red);
        g.drawLine(x1,y1,x2,y2);
        g.drawLine(x2,y2,x3,y3);
        Graphics2D g2d = (Graphics2D)g;
        AffineTransform at = g2d.getTransform();
        
        g2d.translate(rX, rY);
        g2d.rotate(Math.toRadians(angle));
        g2d.translate(-rX, -rY);
        System.out.println(this);

        g2d.setColor(Color.red);
        g2d.drawLine(x,y,x+30,y);
        g2d.drawLine(x+30,y,x+35,y-10);
        g2d.drawLine(x+35,y-10,x+45,y+10);
        g2d.drawLine(x+45,y+10,x+55,y-10);
        g2d.drawLine(x+55,y-10,x+65,y+10);
        g2d.drawLine(x+65,y+10,x+70,y);
        g2d.drawLine(x+70,y,x+100,y);
        g2d.setColor(Color.BLUE);
        g2d.drawString(Name,x+46,y-12); 
        g2d.drawString(Double.toString(Value),x+32,y+22); // 

        g2d.setTransform(at);
    }
}

