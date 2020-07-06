/***************************************************************************
 * 
 * @author  Krevelix
 * @version 0.01.0000 — 19.11.2019 - [day.month.year]
 * 
 */

import java.awt.Color;

public class Car
{
    private int seats;
    private String znacka;
    private Color color;
    
    public Car(int seats, String znacka, Color color)
    {
        this.seats = seats;
        this.znacka = znacka;
        this.color = color;
    }
    
    public int getSeats()
    {
        return this.seats;
    }
    
    public String getZnacka()
    {
        return this.znacka;
    }
    
    public Color getColor()
    {
        return this.color;
    }
}
