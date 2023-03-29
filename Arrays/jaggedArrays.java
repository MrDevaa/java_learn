public class jaggedArrays
{
    
    public static void main(String a[]) 
    {
        int nums[][][] = new int [3][4][5];   // Thre dimention Array

        for (int i=0; i<nums.length; i++)
        {
            for(int j=0; j<nums[i].length; j++)
            {
                nums[i][j] = (int)(Math.random() * 10);
                // System.out.println(nums [i] [j]);
             }

        }


        for(int  n[] : nums)
        {
            for (int m : n)
            {
                System.out.print(m + " ");
            }
            System.out.println();

        }

    
    }
    
}
