/***************************************************************************
 * 
 * @author  Krevelix
 * @version 0.01.0000 — 30.01.2020 - [day.month.year]
 * 
 */
public class DataStorage<T>
{
    private Node first;
    private Node last;
    private int size;
    private int maxSize;

    public DataStorage() 
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
    
    //Getters
    public int getSize()
    {
        return this.size;
    }
    
    public int getMaxSize()
    {
        return this.maxSize;
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
