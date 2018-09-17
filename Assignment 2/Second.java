<<<<<<< HEAD
import javax.swing.JOptionPane;
class Second 
{
public static void main(String args[ ])
{
int Rs=0;
double Rp;
int [] r=new int[3] ;
for(int i=0;i<3;i++)
{


r[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the resistance " + (i+1) + " value"));
}
for(int k: r) Rs+=k;

JOptionPane.showMessageDialog(null , "The Series Resistance is " + Rs);

Rp=0;
for(double k:r)  Rp += 1/k;


JOptionPane.showMessageDialog(null , "The Parallel Resistance is " + (1/Rp));




}
}



=======
import javax.swing.JOptionPane;
class Second 
{
public static void main(String args[ ])
{
int Rs=0;
double Rp;
int [] r=new int[3] ;
for(int i=0;i<3;i++)
{


r[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the resistance " + (i+1) + " value"));
}
for(int k: r) Rs+=k;

JOptionPane.showMessageDialog(null , "The Series Resistance is " + Rs);

Rp=0;
for(double k:r)  Rp += 1/k;


JOptionPane.showMessageDialog(null , "The Parallel Resistance is " + (1/Rp));




}
}



>>>>>>> 19dc9b86e7dcb14ccc9c136575df973624ad7246
