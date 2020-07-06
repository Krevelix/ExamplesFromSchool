/**
 * @author Krevelix
 * @version 0.1
 * @implNote 2020 - copyright only for code not for pizza etc.
 */

import java.lang.reflect.InvocationTargetException;

public class Pizza 
{
    /*
    public static void setPizzaName(String namePizza)
    {
        pizzaName = namePizza;
    }
    */
    
    /*
    public static String cookPizza(String[][] recipe, int pizzaIndex)
    {
        Object po = udelejInstanci();
        Object o = null;
        for(int i = 0; i < recipe[0].length - 1; i++)
        {
            try 
            {
                o = Class.forName(recipe[pizzaIndex][i+1]).getConstructor(Ipizza.class).newInstance(po);
                po = o;
            } 
            catch (InstantiationException e) 
            {
                System.out.println(e);
            } 
            catch (IllegalAccessException e) 
            {
                System.out.println(e);
            } 
            catch (IllegalArgumentException e) 
            {
                System.out.println(e);
            } 
            catch 
            (InvocationTargetException e) 
            {   
                System.out.println(e);
            }
            catch (ClassNotFoundException e) 
            {
                System.out.println(e);
            } 
            catch (NoSuchMethodException e) 
            {
                System.out.println(e);
            }
        }
        return ((Ipizza)o).dejNaPizzu();
    }
    */
    
    private static Object udelejInstanci()
    {
        Object o = null;
        try 
        {
            o = Class.forName("ZakladPizzi").getConstructor().newInstance();    
        } 
        catch (InstantiationException e) 
        {
            System.out.println(e);
        } 
        catch (IllegalAccessException e) 
        {
            System.out.println(e);
        } 
            catch (IllegalArgumentException e) 
        {
            System.out.println(e);
        } 
        catch (InvocationTargetException e) 
        {   
            System.out.println(e);
        }
        catch (ClassNotFoundException e) 
        {
            System.out.println(e);
        } 
        catch (NoSuchMethodException e) 
        {
            System.out.println(e);
        }
        return o;
    }

    public static String orderPizza(String pizzaName, String[][] menu)
    {
    	Object po = udelejInstanci();
        Object o = null;
        for(int i = 0; i < menu.length; i++)
        {
            if(pizzaName.equals(menu[i][0]))
            {
            	for(int x = 0; x < menu[0].length - 1; x++)
                {
                    try 
                    {
                        o = Class.forName(menu[i][x+1]).getConstructor(Ipizza.class).newInstance(po);
                        po = o;
                    } 
                    catch (InstantiationException e) 
                    {
                    	e.printStackTrace();
                    } 
                    catch (IllegalAccessException e) 
                    {
                    	e.printStackTrace();
                    } 
                    catch (IllegalArgumentException e) 
                    {
                    	e.printStackTrace();
                    } 
                    catch (InvocationTargetException e) 
                    {   
                    	e.printStackTrace();
                    }
                    catch (ClassNotFoundException e) 
                    {
                    	e.printStackTrace();;
                    } 
                    catch (NoSuchMethodException e) 
                    {
                    	e.printStackTrace();
                    }
                }
            	return ((Ipizza)o).dejNaPizzu();
            }
        }
        return new ZakladPizzi().dejNaPizzu();
    }
}