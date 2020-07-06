/***************************************************************************
 * 
 * @author  Krevelix
 * @version 0.01.0000 — 19.11.2019 - [day.month.year]
 * 
 */
public class Zasobnik<T>
{
    private Node first;
    private Node last;
    private int size;
    private int maxSize;

    public Zasobnik() 
    {
        this.size = 0;
        this.maxSize = Integer.MAX_VALUE;
    }
 
    public void add(T attribut)
    {
       Node n = new Node(attribut);
       if (size == 0) 
       {
           this.first = n;
           this.last = n;
           this.first.previous = null;
           size++; 
       } 
       else if(size < maxSize) 
       {
           this.last.next = n;
           n.previous = this.last;
           this.last = n;
           size++; 
       }
       else
       {
           System.out.println("Zasobnik je plny");
       }
    }
    
    public void setItem(int index, T attribut)
    {
    }
    
    public T get(int index) 
    {
        if (index >= size || index < 0) 
        {
            throw new IndexOutOfBoundsException("Mimo indexi: 0 - " + (this.size - 1) + ", index: " + index);
        }
        Node prvek = first;
        for (int i = 0; i < index; i++) 
        {
            prvek = prvek.next;
        }
        return prvek.object;
    }
   
    public void remove(int index) 
    {
        if (index >= size || index < 0) 
        {
            throw new IndexOutOfBoundsException("Mimo indexi: 0 - " + (this.size - 1) + ", index: " + index);
        }
        if (index == 0) 
        {
            first = first.next;
        } 
        else 
        {
            Node curr = first;
            for (int i = 0; i < index - 1; i++) 
            {
                curr = curr.next;
            }
            curr.next = curr.next.next;
            if (index == size - 1) 
            {
                last = curr;
            }
        }
        size--;
    }
    
    public void removeFirst()
    {
        this.first = first.next;
    }
    
    public void removeLast()
    {
        this.last = last.previous;
        size--;
    }
    
    public T getLast()
    {
        return last.object;
    }
    
    public T getFirst()
    {
        return first.object;
    }
    
    public T[] toArray()
    {
       T[] arr = (T[])new Object[size];
       for(int i = 0; i < size; i++)
       {
           arr[i] = get(i);
       }
       return arr;
    }
    
    //Setters
    public void changeSize(int hodnota)
    {
        if(hodnota > size)
        {
            this.maxSize = hodnota;
        }
        else
        {
            System.out.println("Velikost nelze zmenšit jen zvětšit");
        }
    }
    
    public void setDefaultSize()
    {
        this.maxSize = Integer.MAX_VALUE;
    }
    
    //Getters
    public int getSize()
    {
        return this.size;
    }
    
    public int getMaxSize()
    {
        return this.maxSize;
    }
    
    public int getFreeSpaces()
    {
        return this.maxSize - this.size;
    }
    
    //Inner class
    private class Node 
    {
        private T object;
        private Node next;
        private Node previous;

        private Node(T object) 
        {
            this.object = object;
        }
    }
}
