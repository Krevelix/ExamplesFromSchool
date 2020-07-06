/**
 * @author Krevelix
 * @version 0.1
 * @implNote 2020 - copyright only for code not for pizza etc.
 */
public class Syr implements Ipizza
{
    private Ipizza pizza;
    
    public Syr(Ipizza pizza)
    {
        this.pizza = pizza;
    }
    
    public String dejNaPizzu()
    {
        return pizza.dejNaPizzu() + "|Cheese";
    }
}