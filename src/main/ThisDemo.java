package main;

public class ThisDemo {

    private int a;
    private String b;

    ThisDemo(int a,String b)
    {
        a = a;
        this.b = b;
    }

    void display()
    {
        System.out.println("Value of a: "+a);
        System.out.println("Value of b: "+b);
    }
    public static void main(String args[])
    {
        ThisDemo obj1 = new ThisDemo(10,"BHuvi");
        obj1.display();

    }
}
