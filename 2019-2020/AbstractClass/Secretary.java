/***************************************************************************
 * 
 * @author  Krevelix
 * @version 0.01.0000 — 28.11.2019 - [day.month.year]
 * 
 */

import java.util.Date;

public class Secretary extends Zamestnanec
{
    public Secretary(String name, String surrname, int salary, String post)
    {
        super(name, surrname, new Date(1992, 3, 1), salary, post);
    }
    
    public void pracuj()
    {
        System.out.println("Pomaham reditelovy");
    }
}