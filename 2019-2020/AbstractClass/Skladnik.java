/***************************************************************************
 * 
 * @author  Krevelix
 * @version 0.01.0000 — 28.11.2019 - [day.month.year]
 * 
 */

import java.util.Date;

public class Skladnik extends Zamestnanec
{
    public Skladnik(String name, String surrname, int salary, String post)
    {
        super(name, surrname, new Date(1992, 6, 9), salary, post);
    }
    
    public void pracuj()
    {
        System.out.println("Rovnam ve skladu");
    }
}