class Human
{
    private int age;
    private String name ;

    /* Generated Getters and Setter with Soucre Action 
     * 
     * public in getAge() {
     * return age;
     * }
     * 
     * public void setAge(int age) {
     * this.age = age;
     * }
     * 
     * public String getName() {
     * return name;
     * }
     * 
     * public void setName(String name) {
     * this.name = name;
     * }
     */



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
    public void setAge(final int a)
    {
        age = a;
    }


    public void setName(final String n)
    {
        name = n;
    }
}


public class demo {

public static void main(final String a[]) 
{
    final Human obj = new Human();
    obj.setAge(23);
    obj.setName("Devaa");


    System.out.println(obj.getName() + " : " + obj.getAge());
}
}

//chaque fois que vous utilisez une variable d'instance, rendez-la simplement privée