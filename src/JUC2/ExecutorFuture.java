package JUC2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorFuture {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Executors.newCachedThreadPool();
        Callable<Integer> callable = () -> {
            System.out.println("Task 1 is running");
            return 1;
        };

        Future<Integer> submit = executorService.submit(callable);
//        executorService.execute();
//        System.out.println(submit.get());
        executorService.shutdown();

    }
}
