class Student
{
    int rollno;
    String name;
    int marks;
}


 public class DrawbackArrays 
 {
    public static void main(String a[]) 
    {

     Student s1 = new Student();

     s1.rollno = 1;
     s1.name = "Navin readdy";
     s1.marks = 88;

     Student s2 = new Student();
     s2.rollno = 1;
     s2.name =  "Harsh";
     s2.marks = 67;

     Student s3 = new Student();
     s3.rollno = 1;
     s3.name = "Kiran";
     s3.marks = 97;



     Student Students[] = new Student [3]; 
     Students[0] = s1;
     Students[1] = s2;
     Students[2] = s3;

     // Enhanced for loop or  peoples called as a for each loop

     for(Student stud : Students)
     {
        System.out.println(stud.name + " : " + stud.marks);
     }






     //normal for loop

    //  for(int i=0; i<Students.length; i++)
    //  {
    //      System.out.println(Students[i].name + " : " + Students[i].marks );
    //  }


        //  int nums [] = new int [4];
        //  nums [0] = 4;
        //  nums [1] = 8;
        //  nums [2] = 3;
        //  nums [3] = 9;



        // normal Loop

        //  for (int i=0; i<nums.length; i++)
        //  {
        //      System.out.println(nums[i]);
        //  }


        //for loops

        // for(int n : nums)
        // {
        //     System.out.println(n);
        // }
        
    }   
}
