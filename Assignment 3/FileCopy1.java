import java.io.*;

public class FileCopy1
    {
     public static void main(String args[])
         {
         try
             {
             File file = new File(args[0]);
             BufferedReader breader = new BufferedReader(new FileReader(file));
             String line = "", oldtext = "";
             while((line = breader.readLine()) != null)
                 {
                 oldtext += line + "\r\n";
             }
             breader.close();
            
             String newtext = oldtext.replaceAll("&", "&amp;");
	     String newtext1 = newtext.replaceAll("<", "&lt;");
	     String newtext2 = newtext1.replaceAll(">", "&gt;");
            
            
            
             FileWriter out = new FileWriter(args[1]);
             out.write(newtext2);
	    
             out.close();
         }
         catch (Exception e)
             {
             e.printStackTrace();
         }
     }
}