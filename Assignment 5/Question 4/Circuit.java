import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

class mypanel extends JPanel {
    ArrayList<Resistor> mylist = new ArrayList<Resistor>();
    ArrayList<Wire> Wir = new ArrayList<Wire>();
int x1,x2,x3,y1,y2,y3;
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.GREEN);
        for (Resistor r: mylist) r.draw(g);
        for (Wire w: Wir) {w.draw(g);w.draw(g);}
        
    }
    public void readFile(String filepath) {
        try {
            FileReader fr = new FileReader(filepath);
            BufferedReader br = new BufferedReader(fr);
            String line;

            while((line=br.readLine())!=null){
                String delim = "[ ]+"; 
                String[] token = line.split(delim);

                if(token.length >= 5 && token[0].equalsIgnoreCase("R")) {
                    String iR = token[0];
                    String rName = token[1];
                    int start_node = Integer.parseInt(token[2]);
                    int end_node = Integer.parseInt(token[3]);
                    double rValue = Double.parseDouble(token[4]);

                    int rX = 0;
                    int rY = 0;
                    double angle = 0;

                    if(token.length == 8) {
                        rX = Integer.parseInt(token[5]);
                        rY = Integer.parseInt(token[6]);
                        angle = Double.parseDouble(token[7]);
                    }
                    Resistor record = new Resistor(iR,rName,start_node,end_node,rValue,rX, rY, angle);
                    mylist.add(record);
                }
                else if(token.length >= 5 && token[0].equalsIgnoreCase("W")){
                    int x1 = Integer.parseInt(token[1]);
                    int y1 = Integer.parseInt(token[2]);
                    int x2 = Integer.parseInt(token[3]);
                    int y2 = Integer.parseInt(token[4]);

                    int x3 = x2;
                    int y3 = y2;
                    if(token.length == 7)
                    {
                        x3 = Integer.parseInt(token[5]);
                        y3 = Integer.parseInt(token[6]);
                    }
		    
                    Wire w = new Wire(x1,y1,x2,y2,x3,y3);
		    
                   
		    Wir.add(w);
                }
		else if(token.length >=5 && token[0].equalsIgnoreCase("W1")){
		int X1 = Integer.parseInt(token[1]);
                    int Y1 = Integer.parseInt(token[2]);
                    int X2 = Integer.parseInt(token[3]);
                    int Y2 = Integer.parseInt(token[4]);

                    int X3 = X2;
                    int Y3 = Y2;
                    if(token.length == 7)
                    {
                        X3 = Integer.parseInt(token[5]);
                        Y3 = Integer.parseInt(token[6]);
                    }
		   
                    Wire w1 = new Wire(X1,Y1,X2,Y2,X3,Y3);
		 
                    Wir.add(w1);
		    
          }
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
public class Circuit {
    public static void main(String[] args) {
        JFrame frame1=new JFrame("Resistors object");
        mypanel p = new mypanel();
        p.readFile("Netlist.txt"); // 
        frame1.add(p);
        frame1.setVisible(true);
        frame1.setSize(470,400);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}



