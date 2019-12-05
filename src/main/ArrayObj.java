package main;

    class Student1 {
        String name;
        int roll_nbr;
        Student1 (String name,int roll_nbr)
        {
            this.name = name;
            this.roll_nbr = roll_nbr;
        }
    }


public class ArrayObj {
    public static void main(String args[])
    {
        Student1 array1[];
        array1 = new Student1[2];
        array1[0] = new Student1("Bhuvi",100);
        array1[1] = new Student1("Ancy",101);
        for (int i=0;i<array1.length;i++)
            System.out.println(array1[i].name + array1[i].roll_nbr);
    }

}
