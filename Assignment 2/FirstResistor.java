 class FirstResistor 
{
     String name;
     int value;
    FirstResistor(String name, int value)
    {
         this.name=name;
         this.value=value;
    }
    
    public String toString() {
       return "The Resistor name is: "+ this.name +" value is: "+this.value;
    }
    public static void main(String args[])
    {
     FirstResistor resistor=new FirstResistor("aditi",5);
     System.out.println(resistor);
     }
}
