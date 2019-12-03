package main;

import java.util .*;

public class LogicalOperators {

    // Java program to illustrate
// logical operators
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter First Number:");
        int FirstNumber = Integer.parseInt(s.next());
        System.out.print("Enter Second Number:");
        int SecondNumber = Integer.parseInt(s.next());
        System.out.print("Enter Third Number:");
        int ThirdNumber = Integer.parseInt(s.next());
        int result;
        // result holds max of three
        // numbers
        result = ((FirstNumber > SecondNumber)
                ? (FirstNumber > ThirdNumber)
                ? FirstNumber
                : ThirdNumber
                : (SecondNumber > ThirdNumber)
                ? SecondNumber
                : ThirdNumber);
        System.out.println("Max of three numbers = "
                + result);
    }
}
