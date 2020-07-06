/***************************************************************************
 * 
 * @author  Krevelix
 * @version 0.01.0000 — 28.11.2019 - [day.month.year]
 * 
 */

import java.util.Date;

public class Driver extends Zamestnanec
{
    public Driver(String name, String surrname, int salary, String post)
    {
        super(name, surrname, new Date(1992, 9, 6), salary, post);
    }
    
    public void pracuj()
    {
        System.out.println("Řídím");
    }
}
