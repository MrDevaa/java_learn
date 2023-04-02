
class mobile2
{
    String brand;
    int price;
    static String name;

  

    public mobile2()
    {
        brand = "";
        price = 200;
        System.out.println("in the constructor");
    }

    static
    {
        name = "Phone";
        System.out.println("in static block");
    }

    public void show()
{
    System.out.println(brand + " : " + price + " : " + name);
}
}


public class StaticBlock
{
    public static void main (String a[])  throws ClassNotFoundException
    {

        // how to load a classs 
        Class.forName("mobile2");


        // mobile2 obj1 = new mobile2();
        // obj1.brand = "Apple";
        // obj1.price = 1500;
        // mobile2.name = "SmartPhone";

        // mobile2 obj2 = new mobile2();


    }
    
}


// StaticBlock is use to initialize the Static Variables.