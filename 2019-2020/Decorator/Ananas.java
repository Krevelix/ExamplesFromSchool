/**
 * @author Krevelix
 * @version 0.1
 * @implNote 2020 - copyright only for code not for pizza etc.
 */
public class Ananas implements Ipizza
{
    private Ipizza pizza;
    
    public Ananas(Ipizza pizza)
    {
        this.pizza = pizza;
    }
    
    public String dejNaPizzu()
    {
        return pizza.dejNaPizzu() + "|Pineapple";
    }
}