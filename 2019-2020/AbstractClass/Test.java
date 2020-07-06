/***************************************************************************
 * 
 * @author  Krevelix
 * @version 0.01.0000 — 28.11.2019 - [day.month.year]
 * 
 */
public class Test
{
    public static void main(String[] args)
    {
        Zamestnanec ridicCarl = new Driver("Carl", "Novak", 25000, "Ridic");
        Zamestnanec skladnikHummel = new Skladnik("Hummel", "Hamburger", 35000, "Skladnik");
        Zamestnanec sekreterkaSonia = new Secretary("Sonia", "Borsch", 40000, "Sekretarka");
        Zamestnanec[] zamestnanci = {ridicCarl, skladnikHummel, sekreterkaSonia};
        Zamestnanec reditelQuido = new Boss("Quido", "Spagetti", 690000, "Reditel", zamestnanci);
        reditelQuido.pracuj();
    }
}
