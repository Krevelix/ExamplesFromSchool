import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Pes
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int idPsa;
    int idMajitele;
    String jmeno;
    
    public Pes(int idMajitele, String jmeno)
    {
        //this.idPsa = idPsa;
        this.idMajitele = idMajitele;
        this.jmeno = jmeno;
    }
}
