/*******************************************************************************
 * @author: Krevelix
 * @version: 0.01.0000 — 10.10.2019 - [day.month.year]
 */
public class MorseCode
{
    private static String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
                         "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", 
                         "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
                         ",", ".", "?", " "};

    private static String[] morseArray = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", 
                       ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
                       "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                       "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                       "-----", "--..--", ".-.-.-", "..--..", "......." };
                      
    /***************************************************************************
     */
    public MorseCode()
    {
    }
    
    public static String translateToMorse(String text)
    {
        String morse = "";
        text = text.toLowerCase();
        for(int i = 0; i < text.length(); i++)
        {
            for(int index = 0; index < alphabet.length; index++)
            {
                if(text.substring(i, i + 1).equals(alphabet[index]))
                {
                    morse = morse + morseArray[index] + "   /   ";
                    break;
                }
            }
        }
        return morse;
    }
}
