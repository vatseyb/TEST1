package main;

public class OverridingExtends {
    public static void main(String[] args)
    {
        int answerSum;
        int answerMult;
        int answerMod;
        int answerdiff;
        /*answer = parent.sum(100,3);
        System.out.println(answer); */
        child c1 = new child();
        answerSum=c1.sum(5,89);
        System.out.println(answerSum);
        child c2 = new child();
        answerMult=c2.multiply(5,89);
        System.out.println(answerMult);
        child c3 = new child();
        answerMod=c3.modulus(89,5);
        System.out.println(answerMod);
        parent p1 = new parent();
        answerdiff=p1.subtract(100,49);
        System.out.println(answerdiff);

    }
}

class parent {

    public int sum(int a, int b)
    {
            int total;
            total = a + b;
            return total;
    }

    public int subtract(int a, int b)
    {
        int diff;
        diff = a - b;
        return diff;
    }
    public int divide(int a, int b)
    {
        int div;
        div = divide(a, b);
        return div;
    }
    public int multiply(int a, int b)
    {
        int mult;
        mult = a * b;
        return mult;
    }

}

class child extends parent {

    public int modulus(int a,int b)
    {
        int mod;
        mod = a % b;
        return mod;
    }

}
