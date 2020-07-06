abstract class PridavacFunkce implements IDerovac
{
    protected ZakladniDerovac zd;
    
    public PridavacFunkce(ZakladniDerovac lepsiDerovac)
    {
        this.zd = lepsiDerovac;
    }
    
    public void udelejDiru()
    {
       zd.udelejDiru();
    }
}
