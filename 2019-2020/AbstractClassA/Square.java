/*******************************************************************************
 * Instance třídy {@code Triangle} představují ...
 * The {@code Triangle} class instances represent ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
class Square extends Shape 
{    
   protected double width; 
   protected double height;
   
   public Square(double x, double y, double width) 
   { 
      super(x, y);
      this.width = width;
   } 
   
   public double obvod() 
   { 
       return 4 * width; 
   } 
   
   public double obsah() 
   { 
       return width * width;
   } 
   
   public void getInfo()
   {
      System.out.println("X: " + x);
      System.out.println("Y: " + y); 
      System.out.println("Width: " + width); 
   }
}
