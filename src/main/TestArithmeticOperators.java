package main;

// Java program to illustrate
// unary operators 
public class TestArithmeticOperators {
    public static void main(String[] args) {
        int a = 20, b = 10;
        String x = "Thank", y = "Thank";
        final int i = 20;
        //int i1 = i++;
        int ar[] = {1, 2, 3};
        int br[] = {1, 2, 3};
        boolean condition = true;

        // various conditional operators
        System.out.println("a == b :" + (a == b));
        System.out.println("i:"+i);
        System.out.println("a < b :" + (a < b));
        System.out.println("a <= b :" + (a <= b));
        System.out.println("a > b :" + (a > b));
        System.out.println("a >= b :" + (a >= b));
        System.out.println("a != b :" + (a != b));

        // Arrays cannot be compared with
        // relational operators because objects
        // store references not the value
        System.out.println("x == y : " + (ar == br));

        System.out.println("condition==true :"
                + (condition == true));
    }
}
