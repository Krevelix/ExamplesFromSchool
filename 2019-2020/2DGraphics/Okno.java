/*******************************************************************************
 * Instance třídy {@code Okno} představují ...
 * The {@code Okno} class instances represent ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Okno extends JFrame
{
    public Okno()
    {
        this.setSize(640, 480);
        this.setTitle("Moje okno");
        this.setLocation(100, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
        Platno platno = new Platno();
        this.add("Center", platno);
    }
}
