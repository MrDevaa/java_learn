public class StringBuffer 
{
    public static void main(String a[])
    {
        StringBuffer sb = new StringBuffer("Deva");
        sb.append(" readdy");

        //delete an index
        sb.deleteCharAt(index:2);

        // insert 
        sb.insert(5, "Java");

        // SubSring stating point and the ending point
        sb.SubSring();

        // set length 
        sb.setLength(30);

        // set minimum and maximun data
        //mininmum capacity will be 100
        sb.ensureCapacity(100);

        System.out.println(sb);

        String str = sb.toString();

    }   
}

// Default capacity is 16 
// after str will be add So ex(16 + 4 = 20)


/* Difference between Stringbuffer and StringBuilder
 *Stringbuffer is thread safe
 * StringBuilder is not
 */
