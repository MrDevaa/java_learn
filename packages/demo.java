// import in java
import other.*;



class C extends A
{
    public void abc ()
    {
        System.out.println(marks);

    }

}


public class demo 
{
    public static void main(String a[])
     {
        A obj = new A();
        System.out.println(obj.marks);
        obj.show();
        
        B obj1 = new B();
        System.out.println(obj1.marks);
    }


}
