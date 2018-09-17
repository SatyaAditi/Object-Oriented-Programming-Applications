<<<<<<< HEAD
import java.util.*;
class ResistorClass
{
public String r_name;
public float r_value;
}
public class Resistor
{
public static void main(String args[])
{float Rp=0;
ResistorClass r1=new ResistorClass();//Object1 of Resistor class
ResistorClass r2=new ResistorClass();//Object2 of Resistor class
ResistorClass r3=new ResistorClass();//Object3 of Resistor class
r1.r_name = args[0];
r1.r_name = args[2];
r1.r_name = args[4];
r1.r_value=Float.parseFloat(args[1]);
r2.r_value=Float.parseFloat(args[3]);
r3.r_value=Float.parseFloat(args[5]);
ArrayList <Float> al=new ArrayList<Float>();
al.add(r1.r_value);
al.add(r2.r_value);
al.add(r3.r_value);
for ( Object obj:al)
{
double m= ((Number) obj).doubleValue();
System.out.println(obj);
Rp +=1/m;
}


System.out.println("The parallel Resistance for the arraylist objects is " + (1/Rp));


}
}
=======
import java.util.*;
class ResistorClass
{
public String r_name;
public float r_value;
}
public class Resistor
{
public static void main(String args[])
{float Rp=0;
ResistorClass r1=new ResistorClass();//Object1 of Resistor class
ResistorClass r2=new ResistorClass();//Object2 of Resistor class
ResistorClass r3=new ResistorClass();//Object3 of Resistor class
r1.r_name = args[0];
r1.r_name = args[2];
r1.r_name = args[4];
r1.r_value=Float.parseFloat(args[1]);
r2.r_value=Float.parseFloat(args[3]);
r3.r_value=Float.parseFloat(args[5]);
ArrayList <Float> al=new ArrayList<Float>();
al.add(r1.r_value);
al.add(r2.r_value);
al.add(r3.r_value);
for ( Object obj:al)
{
double m= ((Number) obj).doubleValue();
System.out.println(obj);
Rp +=1/m;
}


System.out.println("The parallel Resistance for the arraylist objects is " + (1/Rp));


}
}
>>>>>>> 19dc9b86e7dcb14ccc9c136575df973624ad7246
