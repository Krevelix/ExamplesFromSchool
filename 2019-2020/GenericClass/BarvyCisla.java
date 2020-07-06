/***************************************************************************
 * 
 * @author  Krevelix
 * @version 0.01.0000 — 21.11.2019 - [day.month.year]
 * 
 */

public enum BarvyCisla
{
    Zelena (0, 255, 0),
    Cervena (255, 0, 0),
    Modra (0, 0, 255);
    
    private int r;
    private int g;
    private int b;
    
    private BarvyCisla(int r, int g, int b)
    {
        this.r = r;
        this.g = g;
        this.b = b;
    }
    
    public int getR()
    {
        return this.r;
    }
    
    public int getG()
    {
        return this.g;
    }
    
    public int getB()
    {
        return this.b;
    }
}
