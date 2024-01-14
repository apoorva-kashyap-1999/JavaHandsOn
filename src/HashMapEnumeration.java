import java.util.Enumeration;
import java.util.Hashtable;
public class HashMapEnumeration {
    public static void main(String[] args)
    {
        // Creating an empty hashtable
        Hashtable<Integer, String> ht
                = new Hashtable<Integer, String>();

        // Inserting key-value pairs into hash table
        // using put() method
        ht.put(1, "Geeks");
        ht.put(2, "for");
        ht.put(3, "Geeks");

        // Now creating an Enumeration object
        //  to read elements
        Enumeration e = ht.elements();

        // Condition holds true till there is
        // single key remaining

        // Printing elements of hashtable
        // using enumeration
        while (e.hasMoreElements()) {

            // Printing the current element
            System.out.println(e.nextElement());
        }
    }
}
