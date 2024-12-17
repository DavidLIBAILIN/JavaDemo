package JUC2;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class Demo01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println(Thread.currentThread().getState().toString());
        CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "runAsync => Void");
        });


        System.out.println("222222222222222222222" + Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getState().toString());
        System.out.println("333333333333333333" + Thread.currentThread().getName());
        completableFuture.get();
        System.out.println("111111111111111111"+ Thread.currentThread().getName());

    }
}
