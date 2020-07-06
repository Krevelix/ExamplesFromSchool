/*******************************************************************************
 * 
 * @author  Krevelix
 * @version 0.01.0000 — 17.10.2019 - [day.month.year]
 * 
 */

import java.util.Scanner;

public class Main
{
    private static MainPart program;
    
    public static void main(String[] args)
    {
        program = new MainPart();
        Scanner sc = new Scanner(System.in); 
        boolean run = true;
        while(run)
        {
            start();
            System.out.println("Chete ukoncit [A/N]");
            if(sc.next().toUpperCase().equals("A"))
            {
                run = false;
            }
        }
    }
    
    private static void start()
    {
        program.addPerson();
        program.jizda();
    }
}

