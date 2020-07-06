import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Majitel
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String jmeno;
    String prijmeni;
    @OneToMany
    ArrayList<Pes> seznamPsu;
    
    public Majitel()
    {
         seznamPsu = new ArrayList(); 
    }
    
    public Majitel(String jmeno, String prijmeni)
    {
        //this.id = i;
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        seznamPsu = new ArrayList();
    }
    
    public void addPsa(Pes pes)
    {
        seznamPsu.add(pes);
    }
    
    public String getJmeno()
    {
        return jmeno;
    }
    
    public String getPrijmeni()
    {
        return prijmeni;
    }
    
    public void setJmeno(String jmeno)
    {
        this.jmeno = jmeno;
    }
    
    public void setPrijmeni(String prijmeni)
    {
        this.prijmeni = prijmeni;
    } 
}
