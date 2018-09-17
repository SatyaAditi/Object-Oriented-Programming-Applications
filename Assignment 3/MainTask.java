import java.util.ArrayList;

class Ecomponent
{
	String name;
	double value;
	Ecomponent()
	{
		name = "none";
		value = 0;
	}
	Ecomponent(String name, double value)
	{
		this.name = name;
		this.value = value;
	}

	public String toString()
	{
	return String.format("EComponent: " + name + "  " + value );
	}
}
class Resistor extends Ecomponent
{
	Resistor(String name, double value)
	{
		super(name,value);
	}

	public String toString()
	{
	return String.format("Resistor: " + name + "  " + value );
	}
}
class Inductor extends Ecomponent
{
	Inductor(String name, int value)
	{
		this.name = name;
		this.value = value;
	}

	public String toString()
	{
	return String.format("Inductor: " + name + "  " + value );
	}
}
class Capacitor extends Ecomponent
{
	 Capacitor()
	{
	System.out.println("It is an energy storing element.");
	}
}
class MainTask
{
	public static void main(String args[])
	{
	ArrayList<Ecomponent> list = new ArrayList<Ecomponent>();
	Ecomponent e=new Ecomponent("component1",3);
	Resistor r=new Resistor("R1",1000);
	Inductor i=new Inductor("L1",5);
	Capacitor c=new Capacitor();
	list.add(e);
	list.add(r);
	// When we donot define anything in the child class ,it takes the parent class constructor
	
	
	list.add(c);
	list.add(i);
	for(Object obj:list)
	{
	System.out.println(obj);
	}
	/
	}
}
	

