/***************************************************************************
 * 
 * @author  Krevelix
 * @version 0.01.0000 — 28.11.2019 - [day.month.year]
 * 
 */

import java.util.Date;

public class Boss extends Zamestnanec 
{
    private  Zamestnanec[] employees;
    public Boss(String name, String surrname, int salary, String post, Zamestnanec[] emp)
    {
        super(name, surrname, new Date(1992, 1, 3), salary, post);
        this.employees = emp;
    }
    
    public void pracuj()
    {
        System.out.println("Řvu na tyto lidi:");
        for(Zamestnanec emp : employees)
        {
            emp.getCompleteInfo();
            emp.pracuj();
        }
    }
}
