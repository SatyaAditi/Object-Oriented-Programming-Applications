<<<<<<< HEAD
//Modify your resistance program from the last assignment to accept command line arguments such as R1 1000 R2 500 R3 600 and build an ArrayList of resistor objects. Calculate the equivalent parallel resistance using a simple loop. 
import java.util.*;
class Argument
{
public static void main(String args[ ])
{
double Rp=0;

float r1=Float.parseFloat(args[1]);
float r2=Float.parseFloat(args[3]);
float r3=Float.parseFloat(args[5]);

ArrayList<Float> al=new ArrayList<Float>();
al.add(r1);
al.add(r2);
al.add(r3);

for ( Object obj:al)
{
double m= ((Number) obj).doubleValue();

Rp +=1/m;
}


System.out.println("The parallel Resistance for the arraylist objects is " + (1/Rp));



}
}
//Output:C:\Users\Aditi\Desktop\Assignment 2>javac Argument.java
//C:\Users\Aditi\Desktop\Assignment 2>java Argument R1 45 R2 65 R3 76
=======
//Modify your resistance program from the last assignment to accept command line arguments such as R1 1000 R2 500 R3 600 and build an ArrayList of resistor objects. Calculate the equivalent parallel resistance using a simple loop. 
import java.util.*;
class Argument
{
public static void main(String args[ ])
{
double Rp=0;

float r1=Float.parseFloat(args[1]);
float r2=Float.parseFloat(args[3]);
float r3=Float.parseFloat(args[5]);

ArrayList<Float> al=new ArrayList<Float>();
al.add(r1);
al.add(r2);
al.add(r3);

for ( Object obj:al)
{
double m= ((Number) obj).doubleValue();

Rp +=1/m;
}


System.out.println("The parallel Resistance for the arraylist objects is " + (1/Rp));



}
}
//Output:C:\Users\Aditi\Desktop\Assignment 2>javac Argument.java
//C:\Users\Aditi\Desktop\Assignment 2>java Argument R1 45 R2 65 R3 76
>>>>>>> 19dc9b86e7dcb14ccc9c136575df973624ad7246
//The parallel Resistance for the arraylist objects is 19.698715108551173