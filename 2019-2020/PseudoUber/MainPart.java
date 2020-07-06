/*******************************************************************************
 * This is main part of this app.
 * 
 * @author  Krevelix
 * @version 0.01.0000 — 24.10.2019 - [day.month.year]
 * 
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

public class MainPart
{
    private ArrayList<Person> pasazer;
    private ArrayList<Person> ridic;
    private ArrayList<Vehicle> auta;
    private Scanner sc; 
    private int indx;;
    /***************************************************************************
     */
    public MainPart()
    {
        pasazer = new ArrayList<Person>();
        ridic = new ArrayList<Person>();
        auta = new ArrayList<Vehicle>();
        sc = new Scanner(System.in);
        indx = 0;
    }
    
    private void selectDriver()
    {
       for(int i = 0; i < pasazer.size(); i++)
       {
           if(pasazer.get(i).getIsDriver())
           {
               auta.add(new Vehicle(5, pasazer.get(i)));
               pasazer.remove(i);
            }
       }
    }
    
    public void jizda()
    {
        for(int i = 0; i < auta.size(); i++)
        {
            if(auta.get(i) != null)
            {
                System.out.println("Auto " + i);
                auta.get(i).jizda();
            }
        }
    }
    
    private void assingToCar()
    {
        for(int y = 0; y < auta.size(); y++)
        {
            for(int i = 0; i < pasazer.size(); i++)
            {
                if(pasazer.get(i) != null && auta.get(y) != null)
                {
                    if(pasazer.get(i).getDirection() == auta.get(y).getDirection())
                    {
                        if(auta.get(y).getIsFreeSeat())
                        {
                            auta.get(y).setPassengerToSeat(pasazer.get(i));
                            pasazer.remove(i);
                        }
                    }
                }
            }
        }
    }
    
    public void addPersonFromFile(String path)
    {
        boolean haveLicence;
        String name;
        String surrname;
        String licence;
        Directions smer;
        int vzdalenost;
        indx = 0;
        Scanner scanner = new Scanner(path);
        int pocetRadku = 0;
        while (scanner.hasNextLine()) 
        {
            pocetRadku++;
            scanner.nextLine();
        }
        for(int i = 0; i < pocetRadku / 5; i++)
        {
            name = scanner.nextLine();
            surrname = scanner.nextLine();
            switch(sc.nextLine().toUpperCase())
            {
                case "SEVER": smer = Directions.NORTH; break;
                case "JIH": smer = Directions.SOUTH; break;
                case "ZAPAD": smer = Directions.WEST; break;
                case "VYCHOD": smer = Directions.EAST; break;
                case "SEVEROVYCHOD": smer = Directions.NORTHEAST; break;
                case "SEVEROZAPAD": smer = Directions.NORTHWEST; break;
                case "JIHOVYCHOD": smer = Directions.SOUTHEAST; break;
                case "JIHOZAPAD": smer = Directions.SOUTHWEST; break;
                default: smer = Directions.WEST; break;
            }
            vzdalenost = Integer.parseInt(scanner.nextLine());
            licence = scanner.nextLine();
            if(licence.equals("A"))
            {
                haveLicence = true;
            }
            else
            {
                haveLicence = false;
            }
            pasazer.add(new Person(name, surrname, haveLicence, smer, vzdalenost));
        } 
        scanner.close();
        selectDriver();
    }
    
    public void addPerson()
    {
        boolean haveLicence;
        String name;
        String surrname;
        String licence;
        Directions smer;
        int vzdalenost;
        indx = 0;
        while(true)
        {  
            System.out.println("Zadejte jmeno nebo pro ukonceni pridavani osob zadejte Konec: ");
            name = sc.next();
            if(name.equals("Konec"))
            {
                break;
            }
            System.out.println("Zadejte prijmeni: ");
            surrname = sc.next();
            System.out.println("Zadejte pozadovany smer");
            System.out.println("[JIH, JIHOVYCHOD, JIHOZAPAD]");
            System.out.println("[SEVER, SEVEROVYCHOD, SEVEROZAPAD]");
            System.out.println("[ZAPAD, VYCHOD]");
            switch(sc.next().toUpperCase())
            {
                case "SEVER": smer = Directions.NORTH; break;
                case "JIH": smer = Directions.SOUTH; break;
                case "ZAPAD": smer = Directions.WEST; break;
                case "VYCHOD": smer = Directions.EAST; break;
                case "SEVEROVYCHOD": smer = Directions.NORTHEAST; break;
                case "SEVEROZAPAD": smer = Directions.NORTHWEST; break;
                case "JIHOVYCHOD": smer = Directions.SOUTHEAST; break;
                case "JIHOZAPAD": smer = Directions.SOUTHWEST; break;
                default: smer = Directions.WEST; break;
            }
            System.out.println("Zadejte pozadovanou vzdalenost: ");
            vzdalenost = Integer.parseInt(sc.next());
            System.out.println("Ma osoba licenci [A/N]: ");
            licence = sc.next().toUpperCase();
            if(licence.equals("A"))
            {
                haveLicence = true;
            }
            else
            {
                haveLicence = false;
            }
            pasazer.add(new Person(name, surrname, haveLicence, smer, vzdalenost));
            selectDriver();    
        }
        assingToCar();
    }
}
