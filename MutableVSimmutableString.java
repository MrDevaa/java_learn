public class MutableVSimmutableString
{
    public static void main(String a[])
    {
     String name = "naveen";  // 101
     name = name + " readdy"; // changing the adress from 101 to 105

     System.out.println("hello " + name);

     String s1 = "Naveen"; // 103
     String s2 = "Naveen";

     System.out.println(s1 == s2);


    }
}