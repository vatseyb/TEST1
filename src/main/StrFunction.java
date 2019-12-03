package main;

import java.util.Arrays;

public class StrFunction {
    public static void main(String args[])
    {
        String str = "Hello World";
        String str1 = new String("Hello World");
        String str2 = String.valueOf("Hello World");
        System.out.println(str+" "+str1+" "+str2);

        /*length*/
        System.out.println(str.length());

        /*Concatenating Strings*/
        str+= " People";
        System.out.println(str);

        str = str + ", How is it going?";
        System.out.println(str);

        String s = str.concat(" Having Fun?");

        System.out.println(s);

        System.out.println(str.indexOf('e'));

        System.out.println(str.indexOf('o',5));
        System.out.println(str.charAt(3));
        System.out.println(str.substring(3));
        System.out.println(Arrays.toString(str.split(" ")));
        System.out.println(str.join(",", "Hello","World", "People,", "How", "is, it, going?"));
        System.out.println(str.trim());



    }
}
