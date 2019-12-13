package main;

public class MethodsRevision {
    public static void main(String args[]) {
        int mult = Calculation.multfunc(8,9);
        System.out.println("Multiplcation by Static method: "+ mult);
        Calculation O1 = new Calculation();
        int sub = O1.subfunc(100,72);
        System.out.println("Subtraction by Instance method: "+sub);
    }
    public static class Calculation {

            public static int multfunc(int a, int b) {
                return a*b;
            }

            public int subfunc(int a,int b)
            {
                return a-b;
            }
    }
}

