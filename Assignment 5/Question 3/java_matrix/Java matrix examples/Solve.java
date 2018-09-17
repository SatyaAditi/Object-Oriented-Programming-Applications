import Jama.*; 

/** Example of use of Matrix Class **/

public class Solve {



   /** Shorten spelling of print. **/

   private static void print (String s) {
      System.out.print(s);
   }
   


   public static void main (String args[]) {

     double a[][] = { {4, -2, 1}, {-3, -1, 4}, {1, -1, 3} };
     double v[][] = { {15}, {8}, {13}};
     Matrix A = new Matrix(a);
     print("A = ");
     A.print(8,1);
     Matrix b = new Matrix(v);
     print("b = ");
     b.print(8,1);
     Matrix x = A.solve(b);
     print("x = ");
     x.print(8,4);
     Matrix Residual = A.times(x).minus(b);
     double rnorm = Residual.normInf();
     print("residual = " + rnorm + "\n");
    }
}
