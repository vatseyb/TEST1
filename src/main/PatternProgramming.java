package main;

import java.util.Scanner;

public class PatternProgramming {
    /*
    *   *   *   *
    *   *   *   *
    *   *   *   *
     */
/*
  i rows
  j cols
  tab ;line break
    System.out.print(print in same line);
    System.out.println(print in different line);

    4 times and then once println (cols)
    total 3 times rows

 */
    public static void main(String args[]) {
        //filledRectangle();
        borderRectangle();
    }

    public static void filledRectangle () {
        Scanner scanDetails = new Scanner(System.in);
        System.out.println("Enter the number of Rows");
        int rows = scanDetails.nextInt();
        System.out.println("Enter the number of Columns");
        int columns = scanDetails.nextInt();

        for (int i=0;i<rows;i++) {
            for (int j=0;j<columns;j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
    public static void borderRectangle () {

        Scanner scanDetails = new Scanner(System.in);
        System.out.println("Enter the number of Rows");
        int rows = scanDetails.nextInt();
        System.out.println("Enter the number of Columns");
        int columns = scanDetails.nextInt();

        for (int i=0;i<rows;i++) {
            for (int j=0;j<columns;j++) {
                if (i==0 || i == (rows-1) || j==0 || j == (columns-1))
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}

/***   *   *   *
*           *
*           *
*   *   *   *

i   j   *
0   0   Y
0   1   Y
0   2   Y
0   3   Y
    1   0   Y
    1   1   N
    1   2   N
    1   3   Y
    2   0   Y
    2   1   N
    2   2   N
    2   3   Y
3   0   Y
3   1   Y
3   2   Y
3   3   Y




when rows =0 or rows-1 then print all * tab separated

    cols =0 or cols-1 then only print

*/

