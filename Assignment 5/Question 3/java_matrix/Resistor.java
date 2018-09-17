import Jama.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.awt.*;


public class Resistor  extends JFrame implements ActionListener{
    public static Double a;
private JButton b;
 private JFileChooser filechooser;
 private String line;
int node1,node2;
double value;
ArrayList nodeList=new ArrayList();
ArrayList<Resistor> resList=new ArrayList<Resistor>();
double g;
JTextArea area = new JTextArea(40,30);
public Resistor(Double a)
{
}
public void actionPerformed(ActionEvent e){

   JFileChooser fileChooser = new JFileChooser();
     
    int opr = fileChooser.showOpenDialog(this);
    if(opr == JFileChooser.APPROVE_OPTION);

try
{
File f= fileChooser.getSelectedFile();  
BufferedReader br = new BufferedReader(new FileReader(f));
while((line = br.readLine()) != null)
{
String delims = "[ ]+";
String[] tokens = line.split(delims);

 node1 = Integer.parseInt(tokens[1]);
 node2 = Integer.parseInt(tokens[2]);
double value=Double.parseDouble(tokens[3]);
nodeList.add(node1);
nodeList.add(node2);
resList.add(new Resistor(value));
//mylist.add(new Resistor(name,node1,node2,value,x,y,angle));
//area.append(Integer.toString(node1)+ "\n");
area.append(Integer.toString(nodeList.size()) + "\n");

}


}

catch(IOException ee){

  ee.printStackTrace();

  }
}
public Resistor(){

JPanel p = new JPanel();
setContentPane(p);
JButton b = new JButton("Select your file");

p.add(area);
p.add(b);

b.addActionListener(this);

setSize(600,600);
setLocationRelativeTo(null);
setDefaultCloseOperation(3);

}

int getNode1()
{
return node1;
}
int getNode2()
{
return node2;
}
Double getValue()
{
return value;
}
void solvecircuit()
{
int numberofnodes = nodeList.size();
System.out.println(numberofnodes);
int i=0,j=0;
try{
double x[] [] =new double[numberofnodes] [numberofnodes];
double y[] [] =new double[numberofnodes] [1];
y[0] [0] = 1e-3;
for(int k=0; k<numberofnodes; k++) System.out.println(y[k][0]);
for (Resistor res:resList) {g = 1/res.getValue();
i = res.getNode1() -1;
j = res.getNode2() -1;}
if (i>=0)
{
x[i][j] +=g;
if (j>=0) x[i][j] -=g;
}
if (j>=0)
{
x[j][i] +=g;
if (i>=0) x[j][i] -=g;
}


Matrix X =new Matrix(x);
area.append("A = " + "\n");
Matrix Y=new Matrix(y);
area.append("B= "+ "\n");
Matrix v=X.solve(Y);
area.append("v= "+ "\n");
}
catch(Exception e)
{
}
}
}