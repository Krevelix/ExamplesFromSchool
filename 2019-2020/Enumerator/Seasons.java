/*******************************************************************************
 * @author  author name
 * @version 0.00.0000 — 2019-10-15
 */
import java.util.*;

public enum Seasons
{
     SPRING("Máj vyženeme husy v háj", 12),
     SUMMER("Holidays", 27),
     AUTUM("Listopad - měsíc knihy", 15),
     WINTER("Únor bílí pole sílí", 10);
     
     private final String note;
     private final int NumberOfSunnyDays;
    
    /***************************************************************************
     */
    private Seasons(String str, int pSD)
    {
      this.note = str;  
      this.NumberOfSunnyDays = pSD;
    }
    
    public String getParametres()
    {
        return this.note + " " + this.NumberOfSunnyDays; 
    }
    
    public static String activity(Seasons season)
    {
        switch(season)
        {
            case SPRING: return "Flowers";
            case SUMMER: return "It matures";
            case AUTUM: return "Breeds";
            case WINTER: return "Sleeps";
            default: throw new IllegalArgumentException("Unexpected value of argument: " + season);
        }
    }
}
