import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;
/******************************************************************************
 * This class is reading textfile, that is returned as string, of curse its not one line, its formated the same way as the txt file.
 * @author: Krevelix
 * @version: 0.01.0000 — 08.10.2019 - [day.month.year]
 */
public class ReadBook
{
    private String book;
    
    public ReadBook()
    {
    }
    
    public String read(String path) throws FileNotFoundException, UnsupportedEncodingException, IOException
    {
        String filePath = path, fileEncoding = "UTF-8";
        book = "";
        BufferedReader bReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), fileEncoding));
        String line = null;
        while((line = bReader.readLine()) != null)
        {
            book = book + line + "\n";
        }
        bReader.close();
        return book;
    }
    
    public int wordInText(String word, String text)
    {
        int textlength = text.length();
        int textlength2 = text.replaceAll(word, "").length();
        return (textlength - textlength2) / word.length();
    }
    
    private String nextChapter(String Chapter)
    {
        switch(Chapter)
        {
            case "I": return "CHAPTER II"; 
            case "II": return "CHAPTER III"; 
            case "III": return "CHAPTER IV"; 
            case "IV": return "CHAPTER V"; 
            case "V": return " CHAPTER VI"; 
            case "VI": return "CHAPTER VII"; 
            case "VII": return "CHAPTER VIII"; 
            case "VIII": return "CHAPTER IX"; 
            case "IX": return "CHAPTER X"; 
            case "X": return "CHAPTER XI"; 
            case "XI": return "CHAPTER XII"; 
            case "XII": return "THE END";
            default: return "THE END";
        }
    }
    
    private boolean checkChapter(String Chapter)
    {
        switch(Chapter)
        {
            case "I": return true;
            case "II": return true;
            case "III": return true;
            case "IV": return true;
            case "V": return true;
            case "VI": return true;
            case "VII": return true;
            case "VIII": return true;
            case "IX": return true;
            case "X": return true;
            case "XI": return true;
            case "XII": return true;
            default: return false;
        }
    }
    
    public String readChapter(String text, String Chapter)
    {
        if(checkChapter(Chapter))
        {
            int start = text.indexOf("CHAPTER " + Chapter);
            int end = text.indexOf(nextChapter(Chapter));
            return text.substring(start, end);
        }
        else
        {
            return "There is no chapter " + Chapter;
        }
    }
    
    /*
     * public void readTextLineByLine(String text)
     * {
     *      String line = "";
     *      Scanner scanner = new Scanner(text);
     *      while (scanner.hasNextLine()) 
     *      {
     *          line = scanner.nextLine();
     *      }   
     *      scanner.close();
     *  }
     */
}