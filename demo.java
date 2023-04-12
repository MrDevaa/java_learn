class A
{

    public A()
    {
        System.out.println("obj created");

    }
    public void show()
    {
        System.out.println("in A show");
    }
}

public class demo 
{
    public static void main(String[] a) 
    {
        new A().show();   // Anonymous Object 


        
    }
}