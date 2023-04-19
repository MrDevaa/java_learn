

class Calculator
{
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }
   
}

class ADVCalc extends Calculator
{
    public int add(int n1, int n2)
    {
        return n1+n2+1;

    }

}

public class methodOverriding
{   
    public static void main (String a[])
    {
       ADVCalc obj = new ADVCalc();
       int r1 = obj.add(3, 4);
       System.out.println(r1);
    }
}
