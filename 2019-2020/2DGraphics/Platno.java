/*******************************************************************************
 * Instance třídy {@code Platno} představují ...
 * The {@code Platno} class instances represent ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */

import java.awt.*;

public class Platno extends Canvas
{
    public Platno()
    {
    }
    
    public void paint(Graphics g)
    {
        g.setColor(Color.RED);
        g.fillOval(100, 100, 30, 30);
        g.drawString("NAZDAR", 50, 50);
        g.drawLine(100, 100, 200, 200);
        //g.draw3DRect();
        kinoSal(g);
    }
    
    public void kinoSal(Graphics g)
    {
        boolean[] sedadla = new boolean[64];
        for(int i = 0; i < 64; i++)
        {
            sedadla[i] = false;
        }
        vykresliSedadla(g);
    }
    
    private void vykresliSedadla(Graphics g)
    {
        g.setColor(Color.GREEN);
        int width = 16;
        int height = 16;
        int x = 8;
        int y = 8;
        int mezera = 0;
        int vracec = 0;
        for(int i = 0; i < 64; i++)
        {
            g.drawRect(x + i * 4 - , y + mezera, width, height);
            if(i % 8 == 0)
            {
                mezera += 4;
            }
        }
    }
}