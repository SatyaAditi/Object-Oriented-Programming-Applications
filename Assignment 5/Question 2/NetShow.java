import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.awt.*;

public class NetShow extends JFrame implements ActionListener{

 private JButton b;
 private JFileChooser filechooser;
 private String line;

ArrayList<Resistor> mylist = new ArrayList<Resistor>();
JTextArea area = new JTextArea(40,30);
public void actionPerformed(ActionEvent e){

   JFileChooser fileChooser = new JFileChooser();
     
    int opr = fileChooser.showOpenDialog(this);
    if(opr == JFileChooser.APPROVE_OPTION)

   {  
 
try

{
File f= fileChooser.getSelectedFile();  
BufferedReader br = new BufferedReader(new FileReader(f));
line = br.readLine();
while((line = br.readLine()) != null)

{
		

area.append(line+"\n");
}


}


catch(IOException ee){

  ee.printStackTrace();

  }

 }

}
public static void main(String[] args){


 NetShow s = new NetShow();
  s.setVisible(true);
 
} 
public NetShow(){

JPanel p = new JPanel();
setContentPane(p);
JButton b = new JButton("Select your file");

p.add(area);
p.add(b);

b.addActionListener(this);

setSize(600,800);
setLocationRelativeTo(null);
setDefaultCloseOperation(3);

}


}










 