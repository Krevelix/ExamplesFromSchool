/*******************************************************************************
 * Instance třídy {@code Shape} představují ...
 * The {@code Shape} class instances represent ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
abstract class Shape
{
   protected double x;
   protected double y;
    
   public Shape(double x, double y)
   {
       this.x = x;
       this.y = y;
   }
    
   public abstract double obvod();
   public abstract double obsah();
}