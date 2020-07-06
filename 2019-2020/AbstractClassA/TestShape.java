/*******************************************************************************
 * Třída {@code TestShape} je hlavní třídou projektu,
 * který ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class TestShape
{
    public static void main(String[] args)
    {
        Shape[] array = new Shape[] 
        {
            new Rectangle(0, 0, 2, 5),
            new Square(0, 0, 3),
            new Circle(0, 0, 1)
        };
        
        for(int i = 0; i < array.length; i++)
        {
            System.out.println("array[" + i + "]");
            System.out.println(array[i].obvod());
            System.out.println(array[i].obsah());
        }
        for(Shape shp : array)
        {
            System.out.println("array[" + shp + "]");
            System.out.println(shp.obvod());
            System.out.println(shp.obsah());
        }
    }
}
