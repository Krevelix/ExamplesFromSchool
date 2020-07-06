/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */


import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;



/*******************************************************************************
 * Testovací třída {@code Zkouska} slouží ke komplexnímu otestování
 * třídy {@link Zkouska}.
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class Zkouska
{

   Person Osoba1 = new Person("Bob", "Bubble", true, Directions.SOUTH, 69);
   Person Osoba2 = new Person("Quido", "Spagetti", false, Directions.SOUTH, 70);
   Person Osoba3 = new Person("Carl", "Novak", false, Directions.SOUTH, 30);
   Person Osoba4 = new Person("Sonia", "Borsch", false, Directions.NORTH, 30);
   Person Osoba5 = new Person("Hummel", "Hamburger", false, Directions.SOUTH, 300);
   
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
