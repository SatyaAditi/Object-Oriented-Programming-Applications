class Ecomponent
{
	void unit(String unit)
	{
	System.out.println("The unit of the Component is " + unit);
	}
	void value(int value,String unit)
	{
	System.out.println("The value of the component is " + value + unit );
	}
}

class ResistorClass
{
public String r_name;
public double r_value;
ResistorClass() {
	r_name = "default";
	r_value = 100;
}
ResistorClass(String name, double value)
{
   r_name = name;
   r_value = value;
}
ResistorClass(String name, String vstr)
{
   r_name = name;
   r_value = Double.parseDouble(vstr);
}
}




public class Resistor extends EComponent
{
public static void main(String args[]) {
float Rp=0;
float ParallelResistance=0;
ResistorClass r1=new ResistorClass(args[0],args[1]);//Object1 of Resistor class
ResistorClass r2=new ResistorClass();//Object2 of Resistor class
ResistorClass r3=new ResistorClass();//Object3 of Resistor class
r2.r_name = args[2];
r3.r_name = args[4];
r2.r_value=Float.parseFloat(args[3]);
r3.r_value=Float.parseFloat(args[5]);


ArrayList <ResistorClass> al=new ArrayList<ResistorClass>();
al.add(r1);
al.add(r2);
al.add(r3);
for ( ResistorClass obj:al)
{
double m= obj.r_value;

Rp +=1/m;
}


System.out.println("The parallel Resistance for the arraylist objects is " + (1/Rp));



}


class InductorClass
{
public String l_name;
public double l_value;
ResistorClass() {
	l_name = "default";
	l_value = 100;
}
ResistorClass(String name, double value)
{
   l_name = name;
   l_value = value;
}
ResistorClass(String name, String vstr)
{
   l_name = name;
   l_value = Double.parseDouble(vstr);
}
}




public class Inductor extends EComponent
{
public static void main(String args[]) {
float lp=0;
float ParallelResistance=0;
InductorClass l1=new InductorClass(args[6],args[7]);//Object1 of Resistor class
InductorClass l2=new InductorClass();//Object2 of Resistor class
InductorClass l3=new InductorClass();//Object3 of Resistor class
l2.l_name = args[8];
l3.l_name = args[10];
l2.l_value=Float.parseFloat(args[9]);
l3.l_value=Float.parseFloat(args[11]);


ArrayList <ResistorClass> al=new ArrayList<ResistorClass>();
al.add(r1);
al.add(r2);
al.add(r3);
for ( ResistorClass obj:al)
{
double m= obj.r_value;

lp +=1/m;
}


System.out.println("The parallel Resistance for the arraylist objects is " + (1/lp));

}

class CapacitorClass
{
public String r_name;
public double r_value;
CapacitorClass() {
	c_name = "default";
	c_value = 100;
}
CapacitorClass(String name, double value)
{
   c_name = name;
   c_value = value;
}
CapacitorClass(String name, String vstr)
{
   c_name = name;
   c_value = Double.parseDouble(vstr);
}
}




public class Capacitor extends EComponent
{
public static void main(String args[]) {
float Rp=0;
float ParallelResistance=0;
CapacitorClass c1=new CapacitorClass(args[12],args[13]);//Object1 of Resistor class
CapacitorClass c2=new CapacitorClass();//Object2 of Resistor class
CapacitorClass c3=new CapacitorClass();//Object3 of Resistor class
c2.r_name = args[14];
c3.r_name = args[16];
c2.r_value=Float.parseFloat(args[15]);
c3.r_value=Float.parseFloat(args[17]);


ArrayList <ResistorClass> al=new ArrayList<ResistorClass>();
al.add(r1);
al.add(r2);
al.add(r3);
for ( ResistorClass obj:al)
{
double m= obj.r_value;

Rp +=1/m;
}


System.out.println("The parallel Resistance for the arraylist objects is " + (1/Rp));



class MainTask
{
	public static void main(String args[])
	{
	Ecomponent e=new Ecomponent();
	e.unit("ohm");
	Resistor r=new Resistor();
	r.unit("ohm");
	r.value(44," ohm");
	r.type();
	Inductor i=new Inductor();
	i.unit("henry");
	i.value(55," H");
	i.include();
	Capacitor c=new Capacitor();
	c.unit("farad");
	c.value(66," F");
	c.function();
	}
}
	

