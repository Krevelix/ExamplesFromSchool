/*******************************************************************************
 * Instance třídy {@code Triangle} představují ...
 * The {@code Triangle} class instances represent ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
class Rectangle extends Shape 
{    
   protected double width; 
   protected double height;
   
   public Rectangle(double x, double y, double width, double height) 
   { 
      super(x, y);
      this.width = width;
      this.height = height;
   } 
   
   public double obvod() 
   { 
       return 2 * (width + height); 
   } 
   
   public double obsah() 
   { 
       return width * height;
   } 
   
   public void getInfo()
   {
      System.out.println("X: " + x);
      System.out.println("Y: " + y); 
      System.out.println("Width: " + width); 
      System.out.println("Height: " + height); 
   }
}
