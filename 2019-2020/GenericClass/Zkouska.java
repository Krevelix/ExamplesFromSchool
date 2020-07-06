/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */


import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;
import java.awt.Color;


/*******************************************************************************
 * Testovací třída {@code Zkouska} slouží ke komplexnímu otestování
 * třídy {@link Zkouska}.
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class Zkouska
{

    /*
   Person Osoba1 = new Person("Bob", "Bubble", true,  69);
   Person Osoba2 = new Person("Quido", "Spagetti", false, 70);
   Person Osoba3 = new Person("Carl", "Novak", false, 30);
   Person Osoba4 = new Person("Sonia", "Borsch", false, 30);
   Person Osoba5 = new Person("Hummel", "Hamburger", false, 300);
   */
  
  Car car1 = new Car(5, "Trabant", Color.white);
  Car car2 = new Car(5, "Tesla", Color.pink);
  Car car3 = new Car(5, "Misubitchi", Color.red);
  
  
  
   
    /***************************************************************************
     * Inicializace předcházející spuštění každého testu a připravující tzv.
     * přípravek (fixture), což je sada objektů, s nimiž budou testy pracovat.
     */
    @Before
    public void setUp()
    {
    }


    /***************************************************************************
     * Úklid po testu - tato metoda se spustí po vykonání každého testu.
     */
    @After
    public void tearDown()
    {
    }



//\TT== TESTS PROPER ===========================================================

    /***************************************************************************
     * Test of the {@link #setUp()} method preparing the test fixture.
     */
    @Test
    public void testSetUp()
    {
    }

}
