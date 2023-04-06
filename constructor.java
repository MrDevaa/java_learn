class Human2
{
    private int age;
    private String name ;

    public Human2()
    {
        /*
         * constructor : same name as a class name
         * purpose: never return anything
         */
        age = 12;
        name = "john";
        }



    // Getter
    public int getAge()
    {
        return age;
    }


    public String getName()
    {
        return name;
    }

    // Setter   
    public void setAge( int age)
    {
        this.age = age;
    }


    public void setName( String name)
    {
        this.name = name;
    }
}

 
public class constructor {

public static void main( String a[]) 
{
     Human2 obj = new Human2();
     System.out.println(obj.getName() + " : " + obj.getAge());

    // obj.setAge(23);
    // obj.setName("Devaa");


    // System.out.println(obj.getName() + " : " + obj.getAge());
}
}

/*
 * everytime you create a new object it will be called the constructor
 * 
 * for ex : if you want to connect with a database ?
 * 
 * you write the connection in the consructor
 */ 