package JUC2;

import java.util.concurrent.atomic.AtomicReference;

public class SpinlockDemo {
    AtomicReference<Thread> atomicReference = new AtomicReference<>();

    public void myLock() {
        Thread thread = Thread.currentThread();
        System.out.println(Thread.currentThread().getName() + " ==> mylock");

        while (!atomicReference.compareAndSet(null, thread)) {

        }
    }

    public void myUnlock() {
        Thread thread = Thread.currentThread();
        System.out.println(Thread.currentThread().getName() + " ==> myUnlock");
        atomicReference.compareAndSet(thread, null);
    }
}
