public class Resistor{
 public String name;
 public int node1,node2;
 public double x, y;
 public double z;
 public double value, angle;

public Resistor(String name, double r)

{ 
	this.name = name;
	r=z;
}

public String toString()
{
return " name= " + name + " node1= "+node1+ " node2= "+node2 +"value"+" " + x + " " + y+" " +angle;
}

public  Resistor(String name, int node1, int node2,double value, double x, double y, double angle)
	{
		this.name=name;
		this.node1=node1;
		this.node2=node2;
                this.value=value;
		this.x=x;
		this.y=y;
                this.angle=angle;
	}

}