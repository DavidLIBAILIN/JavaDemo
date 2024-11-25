import java.util.Hashtable;

public class HashtableDemo {
    public static void main(String args[]) {

        // create hash table
        Hashtable<Integer,Integer> hashtable = new Hashtable<>();

        // populate hash table
        hashtable.put(1, 1);
        hashtable.put(2, 2);
        hashtable.put(3, 3);
        try {
            hashtable.remove(null);
        } catch (NullPointerException e) {
            System.out.println("Null key is inputed");
        }

        System.out.println("Hashtable elements: " + hashtable);
    }
}