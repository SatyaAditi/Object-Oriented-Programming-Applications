import java.util.ArrayList;
import java.io.*;
import java.util.*;

public class Question2
{

public static void main(String args[]){

  for(int j=0;j< args.length();j++) 
   {
	String phrase = args[j];
   String delims = "[ ]+";
   String[] tokens = phrase.split(delims);
}

for(int i = 0; i < tokens.length; i++){
System.out.println(tokens[i]);
}
double resistance=0, presistance=0;

ArrayList<Resistor> list = new ArrayList<Resistor>();  
    
int i = 1;
while(i< tokens.length){
list.add(new Resistor(tokens[i]));
i= i+2;}

for (Resistor resistor : list)
{
double resistor1 = ((Number)obj).doubleValue(resistor);
resistance += 1/resistor1;
}
  
presistance = 1/resistance; 
System.out.println("Result:"+ presistance);

}
}
         
  
   


