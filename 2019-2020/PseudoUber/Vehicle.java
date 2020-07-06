/***************************************************************************
 * 
 * @author  Krevelix
 * @version 0.01.0000 — 17.10.2019 - [day.month.year]
 * 
 */
public class Vehicle
{
    private Person driver;
    private Directions direction;
    private Person pasazeri[];
    private int distance;
    private boolean isFreeSeat;
    /***************************************************************************
     */
    public Vehicle(int seats, Person driver)
    {
        this.pasazeri = new Person[seats];
        if(driver.getIsDriver())
        {
            this.driver = driver;
        }
        else
        {
            System.out.println("Osoba neme ridicke opravneni.");
        }
        this.direction = driver.getDirection();
        this.distance = driver.getDistance();
        this.isFreeSeat = true;
        setPassengerToSeat(driver);
    }
    
    public int getDistance()
    {
        return distance;
    }
    
    public void setNewDriver(Person driver)
    {
        if(driver.getIsDriver())
        {
            this.driver = driver;
        }
        else
        {
            System.out.println("Osoba neme ridicke opravneni.");
        }
    }
    
    public Person getDriver()
    {
        return driver;
    }
    
    public int getSeats()
    {
        return pasazeri.length;
    }
    
    public boolean getIsFreeSeat()
    {
        return isFreeSeat;
    }
    
    public Directions getDirection()
    {
        return direction;
    }
    
    public void pasengerList()
    {
        for(int i = 0; i < pasazeri.length; i++)
        {
            if(pasazeri[i] != null)
            {
                pasazeri[i].informations();
            }   
        }
    }
    
    public Person getPasazer(int index)
    {
        if(pasazeri[index] != null)
        {
            return pasazeri[index];
        }
        return null;
    }
    
    public void setPassengerToSeat(Person pasazer)
    {
        for(int i = 0; i < pasazeri.length; i++)
        {
            if(pasazer.getDirection() == getDirection())
            {
                if(pasazeri[i] == null)
                {
                    pasazeri[i] = pasazer;
                    break;
                }
                else
                {
                    if(i == pasazeri.length - 1)
                    {
                        isFreeSeat = false;
                        System.out.println("Už není místo.");
                    }
                }
            }
            else
            {
                System.out.println("Pasazer chce jet jinym smerem.");
            }
        }
    }
    
    public void freeSeat(Person pasazer)
    {
        for(int i = 0; i < pasazeri.length; i++)
        {
            if(pasazeri[i] == pasazer)
            {
                System.out.println("Vystoupil: ");
                pasazeri[i].informations();
                pasazeri[i] = null;
                isFreeSeat = true;
                break;
            }
        }
    }
    
    public void jizda()
    {
        for(int y = 1; y < getSeats(); y++)
        {
            if(getPasazer(y) != null)
            {   
                if(getDistance() - getPasazer(y).getDistance() <= 0)
                {   
                    freeSeat(getPasazer(y));
                    System.out.println("Vystoupil na konecne.\n");
                }
                else
                {
                    freeSeat(getPasazer(y));
                    System.out.println("Vystoupil na: " + getPasazer(y).getDistance() + " Km\n");
                }
            }
        }
        freeSeat(getPasazer(0));
        System.out.println("Vystoupil na konecne, byl to ridic.\n");
    }
}
