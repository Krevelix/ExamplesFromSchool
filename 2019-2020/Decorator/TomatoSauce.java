/**
 * @author Krevelix
 * @version 0.1
 * @implNote 2020 - copyright only for code not for pizza etc.
 */
public class TomatoSauce implements Ipizza
{
    private Ipizza pizza;
    
    public TomatoSauce(Ipizza pizza)
    {
        this.pizza = pizza;
    }
    
    public String dejNaPizzu()
    {
        return pizza.dejNaPizzu() + "|TomatoSauce";
    }
}
