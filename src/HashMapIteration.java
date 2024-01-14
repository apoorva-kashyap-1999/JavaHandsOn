import java.util.*;
import java.util.Map.Entry;
public class HashMapIteration {
    public static void main(String[] args)
    {
        // Creating a HashMap
        Map<Integer, String> foodTable
                = new HashMap<Integer, String>();

        // Inserting elements to the adobe HashMap
        // Elements- Key value pairs using put() method
        foodTable.put(1, "Angular");
        foodTable.put(2, "Java");
        foodTable.put(3, "Python");
        foodTable.put(4, "Hibernate");

        System.out.println("using entrySet: ");
        // Iterating HashMap through for loop
        for (Map.Entry<Integer, String> set :
                foodTable.entrySet()) {

            // Printing all elements of a Map
            System.out.println(set.getKey() + " = "
                    + set.getValue());
        }
        System.out.println("using forEach: ");
        foodTable.forEach((key,value) -> System.out.println(key + " = " + value));

        // Iterator
        Iterator<Entry<Integer, String> > new_Iterator
                = foodTable.entrySet().iterator();
        System.out.println("using Iterator: ");
        // Iterating every set of entry in the HashMap
        while (new_Iterator.hasNext()) {
            Map.Entry<Integer, String> new_Map
                    = (Map.Entry<Integer, String>)
                    new_Iterator.next();

            // Displaying HashMap
            System.out.println(new_Map.getKey() + " = "
                    + new_Map.getValue());
        }
    }
}
