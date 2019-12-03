package main;

public class LoopClass {
    public static void main(String args[]) {
        int a=0;
        /*for (a=0;a<=10;a++)
        {
            System.out.println("This is the "+a+"time");
        }*/
        /*while (a<5)
        {
            System.out.println("This is while loop");
            a=a+1;
        }*/
        /*do
        {
            System.out.println("This should run at least once");
            a++;
        }
        while (a<5);
        */
        //arrays
        int n = 0;

        String array[] = {"Bhuvi","Vatsey","Keep","Calm"};

        /*for (n=0;n<4;n++) {
            System.out.println(array[n]);
        }*/
        for (String y:array)
        {
            System.out.println(y);
        }

        }
    }


