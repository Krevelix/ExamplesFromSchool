import java.util.Scanner;
import java.io.*;
/*******************************************************************************
 * This is main class, so as you may know program starts and end here.
 * @author  Krevelix
 * @version 0.01.0000 — 08.10.2019 - [day.month.year]
 */
public class Main
{
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, IOException
    {
       ReadBook reader = new ReadBook();
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Type filename [filename.txt]: ");
       System.out.println(reader.read(sc.next()));
        
       System.out.println("Type word, that you want to find out how many times is in the text [It is case sensitive]: ");
       String word = sc.next();
       System.out.println("Type filename [filename.txt]: ");
       String text = sc.next();
       System.out.println("Word " + word +" is : " + reader.wordInText(word, reader.read(text)) + "x in text");
        
       System.out.println("Type number of the chapter [example: X]: ");
       String chapter = sc.next();
       System.out.println(reader.readChapter(reader.read("aliceInWonderland.txt"), chapter));
       
       System.out.println("Type text for traslation to morsecode: ");
       System.out.println(MorseCode.translateToMorse(sc.nextLine()));
    }
}