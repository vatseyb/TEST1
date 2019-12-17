package main;

import java.util.Scanner;

public class PatternProgrammingTriangles {

    public static void Pattern1() {
        Scanner scanvalues = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = scanvalues.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("\t");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*\t");
            }
            System.out.println();

        }
    }

    public static void Pattern2() {
        Scanner scanvalues = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = scanvalues.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print("*\t");
            }
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("\t");
            }
            System.out.println();
        }
    }

        public static void Pattern3() {
            Scanner scanvalues = new Scanner(System.in);
            System.out.println("Enter the number of rows");
            int rows = scanvalues.nextInt();

            for (int i = 1; i <= rows; i++) {
                for (int k = 0; k <= rows-i; k++) {
                    System.out.print("*\t");
                }
                for (int j = 1; j < i; j++) {
                    System.out.print("\t");
                }
                System.out.println();
            }
        }

    public static void Pattern4() {
        Scanner scanvalues = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = scanvalues.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("\t");
            }
            for (int k = 0; k <= rows-i; k++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
    public static void Pattern5() {
        Scanner scanvalues = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = scanvalues.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("\t");
            }
            for (int k = 1; k <= (2*i-1); k++) {
                System.out.print("*\t");
            }
            System.out.println();

        }
    }

    public static void Pattern6() {
        Scanner scanvalues = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = scanvalues.nextInt();
        int x=1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("\t");
            }
            for (int k = 1; k <= (2*i-1); k++) {
                System.out.print("\t"+2*x);
                x++;
            }
            System.out.println();

        }
    }
    public static void main(String args[]){

            //Pattern1();
            //Pattern2();
            //Pattern3();
            //Pattern4();
            //Pattern5();
              Pattern6();
        }
    }
