import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stack extends Actor
{
    /**
     * Act - do whatever the Stack wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public class Stacks<T> 
    {
    private Node first = null;
    private int size = 0;
    public int size() 
    {
        return size;
    }

    private class Node 
    {
        private T item;
        private Node next;
    }

    public boolean isEmpty() 
    {
        return first == null;
    }

    public void push(T item) 
    {
        Node second = first;
        first = new Node();
        first.item = item;
        first.next = second;
        size++;
    }

    public T pop()
    {
        T item = first.item;
        first = first.next;
        size = size - 1;
        return item;
    }

    public T peek() 
    {
        return first.item;
    }
}
}
