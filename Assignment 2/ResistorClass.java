<<<<<<< HEAD
import java.util.*;
class ResistorClass
{
public String r_name;
public float r_value;
}
public class resistor
{
public static void main(String args[])
{float Rp=0;
resistorClass r1=new ResistorClass();
resistorClass r2=new ResistorClass();
resistorClass r3=new ResistorClass();
r1.r_name = args[0];
r1.r_name = args[2];
r1.r_name = args[4];
r1.r_value=Float.parseFloat(args[1]);
r2.r_value=Float.parseFloat(args[3]);
r3.r_value=Float.parseFloat(args[5]);
ArrayList <resistor> al=new ArrayList<resistor>();
al.add(r1.r_value);
al.add(r2.r_value);
al.add(r3.r_value);
for ( Object obj:al)
{
double m= ((Number) obj).doubleValue();

Rp +=1/m;
}


System.out.println("The parallel Resistance for the arraylist objects is " + (1/Rp));


}
=======
import java.util.*;
class ResistorClass
{
public String r_name;
public float r_value;
}
public class resistor
{
public static void main(String args[])
{float Rp=0;
resistorClass r1=new ResistorClass();
resistorClass r2=new ResistorClass();
resistorClass r3=new ResistorClass();
r1.r_name = args[0];
r1.r_name = args[2];
r1.r_name = args[4];
r1.r_value=Float.parseFloat(args[1]);
r2.r_value=Float.parseFloat(args[3]);
r3.r_value=Float.parseFloat(args[5]);
ArrayList <resistor> al=new ArrayList<resistor>();
al.add(r1.r_value);
al.add(r2.r_value);
al.add(r3.r_value);
for ( Object obj:al)
{
double m= ((Number) obj).doubleValue();

Rp +=1/m;
}


System.out.println("The parallel Resistance for the arraylist objects is " + (1/Rp));


}
>>>>>>> 19dc9b86e7dcb14ccc9c136575df973624ad7246
}