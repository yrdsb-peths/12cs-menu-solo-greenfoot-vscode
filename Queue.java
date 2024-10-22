import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Queue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Queue extends Actor
{
    /**
     * Act - do whatever the Queue wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    
    }
    public class Queues<T> 
    {
    private Node first, last;

    private class Node
    { 
        T item;
        Node next;
    }
    public boolean isEmpty() 
    {
        return (first == null); 
    }

    public void enqueue(T item) 
    {
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty())
        {
            first = last;
        }
        else
        {
            oldLast.next = last;
        }
    }

    public T dequeue() 
    {
        T item = first.item;
        first = first.next;
        if (isEmpty())
        {
            first = last;
        }
        return item;
    }
    }
}

