import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
 class Resistor{

 public static double a;

public Resistor(String x)

{ 
a=Double.parseDouble(x);
  }
}
class ParseSplit
{
public static void main(String args[])
{
float ParallelResistance=0;
String phrase=JOptionPane.showInputDialog(null,"Input String of Resistor names and values");


   String delims = "[ ]+";

   String[] tokens = phrase.split(delims);
   

for(int i = 0; i < tokens.length; i++)
{
System.out.println(tokens[i]);
} 




ArrayList <Resistor> f=new ArrayList<Resistor>();

for(int j=1;j<tokens.length;j=j+2)
{
f.add(new Resistor(tokens[j]));
}

for (Resistor k:f)
{
Double p=Resistor.a;
 ParallelResistance += 1/p;
}
System.out.println("The parallel Resistance of the Parsed string is " + (1/ParallelResistance));
String s=String.valueOf((1/ParallelResistance));
JOptionPane.showMessageDialog(null,"Parallel Resistance" + s);
}
}
