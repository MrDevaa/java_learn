
class mobile
{
    // variables instances
    String brand;
    int price;
    // do to common for all 
    static String name;

    public void show()
{
    System.out.println(brand + " : " + price + " : " + name);
}
}


public class Static
{
    public static void main (String a[])
    {
        mobile obj1 = new mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        mobile.name = "SmartPhone";
        
        mobile obj2 = new mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        mobile.name = "SmartPhone";


        // mobile.name = "Phone";

        obj1.show();
        obj2.show();
    }
    
}
