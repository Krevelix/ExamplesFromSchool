/**
 * Write a description of class Prepravka here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Prepravka
{
    public final String jmeno, prijmeni, email, oblibenaHra, datum, aktivniEsport;
    
    public Prepravka(String jmeno, String prijmeni, String email, String oblibenaHra, String aktivniEsport, String datum)
    {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.email = email;
        this.oblibenaHra = oblibenaHra;
        this.aktivniEsport = aktivniEsport;
        this.datum = datum;
    }
}
