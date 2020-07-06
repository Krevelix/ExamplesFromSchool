/*******************************************************************************
 * @author  author name
 * @version 0.01.0000 — 15.10.2019
 */

import java.util.*;
import java.awt.Color;


public class TestEnum
{
    /***************************************************************************
     * Metoda, prostřednictvím níž se spouští celá aplikace.
     *
     * @param args Parametry příkazového řádku
     */
    public static void main(String[] args)
    {
       for(Seasons se : Seasons.values())
       {
           System.out.println(se + " " + se.ordinal() + " " + se.getParametres());
       }
       System.out.println("");
       
       EnumSet<Seasons> set0 = EnumSet.allOf(Seasons.class);
       System.out.println("Set0 containls all seasons: " + set0);
       System.out.println("");
       
       EnumSet<Seasons> set1 = EnumSet.of(Seasons.SPRING);
       System.out.println("Set1: " + set1);
       System.out.println("");
       
       EnumSet<Seasons> set2 = EnumSet.complementOf(set1);
       System.out.println("Set2 contains that that is not in set1: " + set2);
       System.out.println("");
       
       EnumSet<Seasons> set3 = EnumSet.range(Seasons.SUMMER, Seasons.WINTER);
       System.out.println("Set3 contains range: " + set3);
       System.out.println("");
       
       Seasons se = Seasons.SPRING;
       System.out.println(se.getParametres());
       System.out.println("");
       
       for(Seasons se2: Seasons.values())
       {
           System.out.println(se2 + "    " + se2.activity(se2));
       }
    }
}
