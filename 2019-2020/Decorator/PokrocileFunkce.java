public class PokrocileFunkce extends PridavacFunkce
{
    ZakladniDerovac dz;
    public PokrocileFunkce(ZakladniDerovac dz)
    {
        super(dz);
        this.dz = dz;
    }
    
    public void udelejDiru()
    {
        vykreslyRadek(3);
    }
    
    public void vykreslyRadek(int pocetDer)
    {
        for(int i = 0; i < pocetDer; i++)
        {
            dz.udelejDiru();
        }
    }
    
    /*
    public void vykreslyCustomRadek(int pocetDer, int[] vynechej)
    {
        int index = 0;
        for(int i = 0; i < pocetDer; i++)
        {
            if(vynechej[index] == i)
            {
                if(index++ < vynechej.length)
                {
                    index++;
                }
                System.out.print("");
            }
            else
            {
                System.out.print(dz.udelejDiru());
            }
        }
    }
    */
}
