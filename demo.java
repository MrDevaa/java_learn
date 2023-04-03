class Human
{
    private int age;
    private String name ;

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
    public void setAge(int a)
    {
        age = a;
    }


    public void setName(String n)
    {
        name = n;
    }
}


public class demo {

public static void main(String a[]) 
{
    Human obj = new Human();
    obj.setAge(23);
    obj.setName("Devaa");


    System.out.println(obj.getName() + " : " + obj.getAge());
}
}

//chaque fois que vous utilisez une variable d'instance, rendez-la simplement privée