package main;
import java.util.*;

public class ReadInputArray {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Array rows");
            int a = scan.nextInt();
            System.out.println("Enter Array columns");
            int b = scan.nextInt();
            int array1[][];
            array1 = new int[a][b];
            for (int i=0;i<a;i++)
            {
                for (int j=0;j<b;j++)
                {
                    array1[i][j] = scan.nextInt();
                }
            }
            for (int i=0;i<a;i++)
            {
                for (int j=0;j<b;j++)
                {
                    System.out.println(array1[i][j]);
                }
            }
        }
    }
