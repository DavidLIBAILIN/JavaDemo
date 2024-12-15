package Future;

import java.util.concurrent.Executors;

public class ExecutorDemo {
    public static void main(String[] args) {
        Executors.newSingleThreadExecutor();
        Executors.newFixedThreadPool(5);
        Executors.newCachedThreadPool();
    }
}
