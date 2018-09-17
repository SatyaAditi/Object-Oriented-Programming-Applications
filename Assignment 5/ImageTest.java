import java.awt.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
import java.awt.geom.AffineTransform;
import javax.swing.ImageIcon;




class ImageFrame extends JFrame
{

   public ImageFrame()
   {
      setTitle("ImageTest");
      setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

   

      ImageComponent component = new ImageComponent();
      add(component);
   }

   public static final int DEFAULT_WIDTH = 800;
   public static final int DEFAULT_HEIGHT = 400;

}


class ImageComponent extends JComponent
{
Color c;
   public ImageComponent()
   {
     
      try
      {

         image = ImageIO.read(new File("Flower.jpg"));
          image1 = ImageIO.read(new File("Rose.jpg"));
        image2 = ImageIO.read(new File("Shoeflower.jpg"));
      }
      catch (IOException e)
      {
         e.printStackTrace();
      }
   }


   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
    
   
       this.setBackground(Color.BLUE);
      int imageWidth = image.getWidth(null);
      int imageWidth1 = image1.getWidth(null);
      int imageWidth2 = image2.getWidth(null);
      int imageHeight = image.getHeight(null);
      int imageHeight1 = image1.getHeight(null);
     int imageHeight2 = image1.getHeight(null);


      g.drawImage(image, 0, 30, imageWidth,imageHeight,  null);
      g.drawImage(image1, imageWidth+20, 30, imageWidth1,imageHeight1,  null);
      g.drawImage(image2, imageWidth+imageWidth1+40, 30,imageWidth2 ,imageHeight2,  null);

   }

   private Image image;
   private Image image1;
      private Image image2;
}
public class ImageTest
{
   public static void main(String[] args)
   {

               ImageFrame frame = new ImageFrame();
               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               frame.setVisible(true);


   }
}
  


