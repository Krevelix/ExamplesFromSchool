import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class UlozDB
{
    public static void main( String[ ] args ) 
    {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("majitel.odb");
        EntityManager em = emfactory.createEntityManager();
        em.getTransaction().begin();
        
        Pes pes1 = new Pes(1,"Rex");
        Pes pes2 = new Pes(2,"Alík");
        Pes pes3 = new Pes(1,"Pes");
        Pes pes4 = new Pes(3,"Jack");
        
        Majitel majitel1 = new Majitel("Jirka", "Novák");
        majitel1.addPsa(pes1);
        majitel1.addPsa(pes3);
        
        Majitel majitel2 = new Majitel("Jan", "Lehký");
        majitel2.addPsa(pes2);
        
        Majitel majitel3 = new Majitel("Tomáš", "Zahradník");
        majitel2.addPsa(pes4);
        
        em.persist(majitel1);
        em.persist(majitel2);
        em.persist(majitel3);
        em.persist(pes1);
        em.persist(pes2);
        em.persist(pes3);
        em.persist(pes4);
        //em.persist(pes1);
        /*Query q1 = em.createQuery("SELECT c FROM Majitel c");
        List list1 = q1.getResultList();
        for(Object element : list1) {
            Majitel mjtl = (Majitel)element;
            System.out.println(mjtl.getJmeno());
        }*/
        em.getTransaction().commit();
        em.close();
        emfactory.close();
    }
}
