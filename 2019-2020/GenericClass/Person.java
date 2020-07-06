/*******************************************************************************
 *
 * @author  Krevelix
 * @version 0.01.0000 — 17.10.2019 - [day.month.year]
 * 
 */
public class Person
{
    private String name;
    private String surrname;
    private boolean isDriver;
    private int distance;
    /***************************************************************************
     */
    public Person(String name, String surrname, boolean isDriver, int distance)
    {
        this.name = name;
        this.surrname = surrname;
        this.isDriver = isDriver;
        this.distance = distance;
    }
    
    public int getDistance()
    {
        return distance;
    }
    
    public boolean getIsDriver()
    {
        return isDriver;
    }
    
    public void informations()
    {
        System.out.println("Jmeno: " + name);
        System.out.println("Prijmeni: " + surrname);
        System.out.println("Je opravneny ridic: " + isDriver);
        System.out.println("Pozadovana vzdalenost [Km]: " + distance);
    }
}
