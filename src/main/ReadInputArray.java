package main;
import com.sun.deploy.security.SelectableSecurityManager;

import java.util.*;
import java.io.*;

public class ReadInputArray {


    static class functions{

        int rows;
        int cols;
        String Inputtype;

        functions(int rows,int cols,String Inputtype) {
            this.rows = rows;
            this.cols = cols;
            this.Inputtype = " ";

        }

        public static void disp(int rows,int cols,String Inputtype,Scanner scanarr){

            PrintWriter pw = new PrintWriter(System.out, true);
            /*Scanner scanarray = new Scanner(System.in);*/
            int[][] arrayint = new int[rows][cols];
            boolean[][] arraybool = new boolean[rows][cols];
            double[][] arraydbl = new double[rows][cols];

            switch (Inputtype) {
                case "Integer":
                    for (int i=0;i<rows;i++)
                    {
                        for (int j = 0; j < cols; j++)
                        {
                            arrayint[i][j] = scanarr.nextInt();
                        }
                    }
                    break;
                case "Double":
                    for (int i=0;i<rows;i++)
                    {
                        for (int j = 0; j < cols; j++)
                        {
                            arraydbl[i][j] = scanarr.nextDouble();
                        }
                    }
                    break;
                case "Boolean":
                    for (int i=0;i<rows;i++)
                    {
                        for (int j = 0; j < cols; j++)
                        {
                            arraybool[i][j] = scanarr.nextBoolean();
                        }
                    }
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + Inputtype);
            }
            switch (Inputtype) {
                case "Integer":
                    for (int i=0;i<rows;i++)
                    {
                        for (int j=0;j<cols;j++) {
                            pw.println(arrayint[i][j]);
                        }
                    }
                    break;
                case "Double":
                    for (int i=0;i<rows;i++)
                    {
                        for (int j=0;j<cols;j++) {
                            pw.println(arraydbl[i][j]);
                        }
                    }
                    break;
                case "Boolean":
                    for (int i=0;i<rows;i++)
                    {
                        for (int j=0;j<cols;j++) {
                            pw.println(arraybool[i][j]);
                        }
                    }
                    break;
            }
        }
        }

        public static void main(String[] args) {

            Scanner scandef = new Scanner(System.in);
            Scanner scanarr = new Scanner(System.in);
            System.out.println("Enter Array rows");
            int rows = scandef.nextInt();
            System.out.println("Enter Array columns");
            int cols = scandef.nextInt();
            String Inputtype;
            if (scanarr.hasNextInt()) {
                Inputtype = "Integer";
                System.out.println(Inputtype);
                functions.disp(rows,cols,Inputtype,scanarr);
                functions.disp(rows,cols,Inputtype,scanarr);
            } else if (scanarr.hasNextDouble()) {
                Inputtype = "Double";
                System.out.println(Inputtype);
                functions.disp(rows,cols,Inputtype,scanarr);
            } else if (scanarr.hasNextBoolean()) {
                Inputtype = "Boolean";
                System.out.println(Inputtype);
                functions.disp(rows,cols,Inputtype,scanarr);
            } else {
                Inputtype = "Input type is not Integer, Double or Boolean";
                // block of code to be executed if the condition1 is false and condition2 is false
            }
        }
    }