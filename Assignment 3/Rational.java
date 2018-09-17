import java.util.Scanner;
import java.util.*;
public class Rational  {
  int top,bot;
  protected static int num, denom;
 private Rational a;
public Rational(int top,int bot)
{
    this.num = num;
this.denom = denom;
	  normalize();
}
protected void normalize() {
    int bigdivisor;
	  if (denom < 0) {
	    num = -num;
	    denom = -denom;
	  }
	  if (num == 0)
	    denom = 1;
	  else {
	    int tempnum = (num < 0) ? -num : num;
	    bigdivisor = gcd(tempnum, denom);
	    if (bigdivisor > 1) {
	      num /= bigdivisor;
		    denom /= bigdivisor;
	    }
	  }
  }
 protected int gcd(int a, int b) {
    while (b > 0) {
      int rem = a % b;
      a = b;
      b = rem;
    }
    return a;
  }
public static int numerator()
{
return num;
}
public static int denominator()
{
return denom;
}   

static public Rational add(Rational a) {
   int top = numerator() * a.denominator() + denominator() * a.numerator();
    int bot = denominator() * a.denominator();
   return new Rational(top,bot);
  }
 
  

String latex()
{
return ("$$\frac{1}{4} + \frac{1}{3}$$");
}
public static void main(String[] args)

{

num=Integer.parseInt(args[0]);
denom=Integer.parseInt(args[1]);
 Rational a=new Rational(4,5);
Rational.add(a);
 
 


  System.out.println("a =" + String.valueOf(a));
}

}

     