package main;

class Test1 {
public static void main (String[] args) {
        String output=InstanceStaticMethods.name("Bhuvi","Vatsey");
        System.out.println(output);
        InstanceStaticMethods a = new InstanceStaticMethods();
        String NameWithDesig=a.getDesig("Tarun","Pillai");
        System.out.println(NameWithDesig);
        }
        }

class InstanceStaticMethods {

    public static String name(String firstn, String lastn) {
        String fullnm = String.valueOf(firstn + lastn);
        return fullnm;
    }
    public String getDesig(String firstn, String lastn)
    {
        return(String.valueOf("Mr/Ms"+" "+firstn+ " "+ lastn));
    }

}





