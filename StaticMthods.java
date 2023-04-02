
class mobile3
{
    String brand;
    int price;
    static String name;

    public void show()
{
    System.out.println(brand + " : " + price + " : " + name);
}

    public static void show1(mobile3 obj)
    
    {
        System.out.println(obj.brand + " : " + obj.price + " : " + name);

    }

}

public class StaticMthods
{
    public static void main (String a[])
    {
        mobile3 obj1 = new mobile3();
        obj1.brand = "Apple";
        obj1.price = 1500;
        mobile3.name = "SmartPhone";
        
        mobile3 obj2 = new mobile3();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        mobile3.name = "SmartPhone";


        // mobile.name = "Phone";

        obj1.show();
        obj2.show();

        mobile3.show1(obj1);
    }
    
}
