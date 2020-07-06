/*******************************************************************************
 * Instance třídy {@code Circle} představují ...
 * The {@code Circle} class instances represent ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class Circle extends Shape
{
   protected double r; 
   
   public Circle(double x, double y, double r) 
   { 
      super(x, y);
      this.r = r;
   } 
   
   public double obvod() 
   { 
       return 2 * 3.14 * r; 
   } 
   
   public double obsah() 
   { 
       return 3.14 * r * r;
   } 
   
   public void getInfo()
   {
      System.out.println("X: " + x);
      System.out.println("Y: " + y); 
      System.out.println("R: " + r); 
   }
}
