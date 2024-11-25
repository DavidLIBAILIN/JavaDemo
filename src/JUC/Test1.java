package JUC;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {

        Ticket ticket = new Ticket();
        new Thread(() -> {
            for (int i = 0; i < 40; i++) ticket.sale();
        }, "A").start();
        new Thread(() -> {
            for (int i = 0; i < 40; i++) ticket.sale();
        }, "B").start();
        new Thread(() -> {
            for (int i = 0; i < 40; i++) ticket.sale();
        }, "C").start();
    }
}

class Ticket {
    private  int number = 50;

    Lock lock = new ReentrantLock();

    public void sale() {

        lock.lock();

        try {
            if (number > 0) {
                System.out.println(Thread.currentThread().getName() + " sold " + (number--)+"tickets, remaining: " + number);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
