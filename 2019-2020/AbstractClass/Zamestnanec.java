/***************************************************************************
 * 
 * @author  Krevelix
 * @version 0.01.0000 — 28.11.2019 - [day.month.year]
 * 
 */

import java.util.Date;
import java.time.LocalDate;

public abstract class Zamestnanec
{
    protected String jmeno;
    protected String prijmeni;
    protected Date datum_nastupu;
    protected int plat;
    protected String pozice;
    
    public Zamestnanec(String name, String surrname, Date datum_nastupu, int plat, String pozice)
    {
        this.jmeno = name;
        this.prijmeni = surrname;
        this.datum_nastupu = datum_nastupu;
        this.plat = plat;
        this.pozice = pozice;
    }
    
    public abstract void pracuj();
   
    public int rekniPocetLet()
    {
        return LocalDate.now().getYear() - datum_nastupu.getYear();
    }
    
    public void pozdarav()
    {
        System.out.println("Dobrý den");
    }
    
    public String getName()
    {
        return jmeno;
    }
    
    public String getSurname()
    {
        return prijmeni;
    }
    
    public String getPozice()
    {
        return pozice;
    }
    
    public int getSalary()
    {
        return plat;
    }
    
    public void getCompleteInfo()
    {
        System.out.println("Name: " + jmeno);
        System.out.println("Surrname: " + prijmeni);
        System.out.println("Post: " + pozice);
        System.out.println("Salary: " + plat);
        System.out.println("Employeed since: " + datum_nastupu.getYear() + "." + datum_nastupu.getMonth() + "." + datum_nastupu.getDay());
    }
}
