class Human2
{
    private int age;
    private String name ;



  

    // public Human2()    // default contructor
    // {
    //     /*
    //      * constructor : same name as a class name
    //      * purpose: never return anything
    //      */
    //     age = 12;
    //     name = "john";
    //     }

    //     public Human2(int a , String n)                                  // Parameterized Contructor
    //     {
    //         age = a;
    //         name = n;
            
    //     }

    // public Human2(int age, String name) {
    //     this.age = age;
    //     this.name = name;                                            // source action vscode generate constructor
    // }


    public Human2() 
    {
        age = 12;
        name = "jhonny";
    }

    
    


    // public Human2(String name) {
    //      age = 12;
    //     this.name = name;                                // generate contructior via souce action only name
    // }





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
    //  Human2 obj1 = new Human2( "navin");
     System.out.println(obj.getName() + " : " + obj.getAge());
    //  System.out.println(obj1.getName() + " : " + obj.getAge());

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