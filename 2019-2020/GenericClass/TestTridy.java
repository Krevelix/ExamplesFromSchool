/***************************************************************************
 * 
 * @author  Krevelix
 * @version 0.01.0000 — 21.11.2019 - [day.month.year]
 * 
 */

import java.awt.Color;
public class TestTridy
{
    public static void main(String[] args)
    {
        //Trida<Integer, Integer> instance = new Trida<>(69, 82);
        try
        {
            Zasobnik<Integer> zasobnik = new Zasobnik();
            
            for(int i = 0; i < 10; i++)
            {
                zasobnik.add(i);
            }
            
            zasobnik.remove(4);
            
            zasobnik.add(10);
            
            System.out.println(zasobnik);
            System.out.println("Velikost seznamu = " + zasobnik.getSize());
            System.out.println("Třetí položka seznamu = " + zasobnik.get(2));
        }
        catch(IllegalArgumentException | IndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
        
        Barva<String> barva1 = new Barva<String>("Yellow");
        System.out.println(barva1.getColor());
        barva1.setColor("Blue");
        
        Barva<Color> barva2 = new Barva<Color>(Color.red);
        System.out.println(barva2.getColor());
        barva2.setColor(Color.pink);
        System.out.println(barva2.getColor());
        
        Barva<BarvyCisla> barva3 = new Barva<BarvyCisla>(BarvyCisla.Zelena);
        System.out.println(barva3.getColor());
        System.out.println(barva3.getColor().getR() + " " + barva3.getColor().getG() + " " + barva3.getColor().getB());
        barva3.setColor(BarvyCisla.Cervena);
        System.out.println(barva3.getColor());
        System.out.println(barva3.getColor().getR() + " " + barva3.getColor().getG() + " " + barva3.getColor().getB());
        
        Barva<Integer> barva4 = new Barva<Integer>(-16777183);
        System.out.println(barva4.getColor());
        barva4.setColor(-175589241);
        System.out.println(barva4.getColor());
    }
}
