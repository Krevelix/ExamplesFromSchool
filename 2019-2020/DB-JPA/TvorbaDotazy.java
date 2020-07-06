import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class TvorbaDotazy 
{
    public static void main( String[ ] args ) 
    {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Majitel-Psy.odb" );
        EntityManager em = emfactory.createEntityManager( );
        
        Query q1 = em.createQuery("SELECT c FROM MAjitel c");
        List list1 = q1.getResultList();
        for(Object element : list1) 
        {
            //Majitel mtl = (Majitel)element;
        }
        //em.getTransaction().commit();
        em.close();
        emfactory.close();
    }
}
