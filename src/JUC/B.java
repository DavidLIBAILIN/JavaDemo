package JUC;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class B {
    public static void main(String[] args) {
        Data data = new Data();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    data.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "A").start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    data.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "B").start();
    }
}
// Wait, Action, Notify
class Data {
    private int number = 0;

    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();


    // +1
    public synchronized void increment() throws InterruptedException {
        if (number != 0) {
            condition.await();
        }
        number++;
        condition.signalAll();
        System.out.println(Thread.currentThread().getName() + " => " + number);
    }

    // -1
    public synchronized void decrement() throws InterruptedException {
        try {
            lock.lock();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        if (number == 0) {
        }
        number--;
        System.out.println(Thread.currentThread().getName() + " => " + number);
    }

}
