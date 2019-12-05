package main;

public class JaggedArrays {

    public static void main(String args[])
    {
        int[][] array1;
        array1 = new int[2][2];
        array1[0][0] = 1;
        array1[1][1] = 4;
        array1[0][1] = 2;
        array1[1][0] = 3;
        for (int i=0;i<2;i++)
        {
            for (int j=0;j<2;j++)
            {
                System.out.println(array1[i][j]);
            }
        }

    }


}
