// Java program to demonstrate working of
// interface.
import java.io.*;

// A simple interface
interface In1
{
    // public, static and final
    final int a = 10;

    // public and abstract
    void display();
}

interface In2
{
    int b = 20;
    int total();
}

// A class that implements the interface.
class InterfaceImplement implements In1
{
    // Implementing the capabilities of
    // interface.
    public void display()
    {
        System.out.println("Geek");
    }

    // Driver Code
    public static void main (String[] args)
    {
        InterfaceImplement t1 = new InterfaceImplement();
        t1.display();
        InterfaceImplement t1 = new InterfaceImplement();
        t1.display();
        System.out.println(a);

    }
}
