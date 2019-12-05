package main;

public class ArrayDemo {

    public static void main (String args[])
    {
        int array1[];
        array1 = new int[2];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        array1[3] = 4;
        array1[4] = 5;

        for (int i=0;i<array1.length;i++) {
            System.out.println(array1[i]);
        }
    }
}
