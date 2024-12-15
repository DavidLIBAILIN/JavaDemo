package Multithread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestThread {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TestCallable t1 = new TestCallable();
        TestCallable t2 = new TestCallable();
        TestCallable t3 = new TestCallable();


        ExecutorService executorService = Executors.newFixedThreadPool(5);

        Future<String> r1 = executorService.submit(t1);
        Future<String> r2 = executorService.submit(t2);
        Future<String> r3 = executorService.submit(t3);

        System.out.println(r1.get());
        System.out.println(r2.get());
        System.out.println(r3.get());

        executorService.shutdown();

    }
}
