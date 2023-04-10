
class A extends Object
{
    public A() 
    {
        super();
        System.out.println("in A");
    }
    public A(int n)
    {
        super();
        System.out.println("in A int");

    }
}

class B extends A 
{
    public B()
    {
        super();
        System.out.println("in B");
    }
    public B(int n)
    {
        this();
        System.out.println("in B int");
        
    }
}

public class demo2 
{
    public static void main(String a[])
    {
        B obj = new B();
    }
    
}


// every constuctor in java as a method called super.