package DEC16Review;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(6);
        for (int i = 1; i <= 6; i++) {
            System.out.println(Thread.currentThread().getName() + " Starts");
            TimeUnit.SECONDS.sleep(1);
            countDownLatch.countDown();
        }
        countDownLatch.await();
        System.out.println(Thread.currentThread().getName() + " Ends");
    }
}
