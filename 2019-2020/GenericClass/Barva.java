/***************************************************************************
 * 
 * @author  Krevelix
 * @version 0.01.0000 — 21.11.2019 - [day.month.year]
 * 
 */

public class Barva<TColor>
{
    private TColor color;
    public Barva(TColor color)
    {
        this.color = color;
    }
    
    public void setColor(TColor color)
    {
        this.color = color;
    }
    
    public TColor getColor()
    {
        return this.color;
    }
}
