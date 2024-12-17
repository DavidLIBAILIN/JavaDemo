package JUC2;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class Demo02 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> objectCompletableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
                System.out.println(Thread.currentThread().getName()+ " supplyAsync => Integer");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 1024;
        });

        System.out.println("This is main thread");
        TimeUnit.SECONDS.sleep(4);
        objectCompletableFuture.whenComplete((t, u) -> {
                    System.out.println("t => " + t);
                    System.out.println("u => " + u);
                })
                .exceptionally((e) -> {
                    System.out.println(e.getMessage());
                    return 233;
                }).get();

        System.out.println("This is main thread");
    }
}
