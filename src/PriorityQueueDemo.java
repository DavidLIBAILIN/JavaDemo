import java.util.PriorityQueue;
import java.util.TreeSet;
import java.util.UUID;
import java.util.Vector;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add(10);
        pq.add(30);
        pq.add(20);
        pq.add(5);
        TreeSet<Integer> ts = new TreeSet<Integer>();

        ts.add(4);
        ts.add(1);
        ts.add(2);
        ts.add(3);
        System.out.println(ts);
        UUID uid = UUID.randomUUID();
        System.out.println(uid);

        Vector<Integer> v = new Vector<>();

    }
}
