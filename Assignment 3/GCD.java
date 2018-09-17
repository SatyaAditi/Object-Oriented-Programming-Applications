import java.util.Scanner;
import java.util.*;

public class GCD
{
 
    long num, denom;

protected void normalize(long num, long denom) {
    long bigdivisor;
	  if (denom < 0) {
	    num = -num;
	    denom = -denom;
	  }
	  if (num == 0)
	    denom = 1;
	  else {
	    long tempnum = (num < 0) ? -num : num;
	    bigdivisor = gcd1(tempnum, denom);
	    if (bigdivisor > 1) {
	      num /= bigdivisor;
		    denom /= bigdivisor;
            }
       System.out.println("GCD of the integers is:" + bigdivisor);
       System.out.println("Result:" + num+"/"+denom);
	    
	  }
  }

  protected long gcd1(long a, long b){
    while (b > 0) {
      long rem = a % b;
      a = b;
      System.out.println("num:"+ a);
      b = rem;
      System.out.println("denom:"+ b);

    }
    return a;
  }

   
  public static void main(String[] args)

{ 

    
	Scanner in=new Scanner(System.in);
      
       int num = Integer.parseInt(args[0]);

      
     
       int denom = Integer.parseInt(args[1]);
       if(denom == 0){
      System.out.print("enter a valid number for denominator:");
       denom = in.nextInt();
       }

    GCD factor= new GCD();

    factor.normalize(num,denom);

}

}

     