package JUC2;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinPoolDemo {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        RecursiveTask<Integer> task = new RecursiveTask<>() {

            @Override
            protected Integer compute() {
                System.out.println("Task is running");
                return 234;
            }
        };
        System.out.println(pool.invoke(task));
        pool.shutdown();
    }
}
