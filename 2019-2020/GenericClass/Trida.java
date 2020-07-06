/***************************************************************************
 * 
 * @author  Krevelix
 * @version 0.01.0000 — 21.11.2019 - [day.month.year]
 * 
 */
public class Trida<T, T2>
{
    private T promena1;
    private T2 promena2;
    
    public Trida(T parametr1, T2 parametr2)
    {
        this.promena1 = parametr1;
        this.promena2 = parametr2;
    }
    
    public void vypisAtribut1()
    {
        System.out.println(promena1);
    }
    
    public void vypisAtribut2()
    {
        System.out.println(promena2);
    }
    
    public boolean porovnej()
    {
        if(promena1 == promena2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
