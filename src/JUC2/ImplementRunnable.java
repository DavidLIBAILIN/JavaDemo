package JUC2;

class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}
public class ImplementRunnable {
    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(() -> {
            System.out.println("New Thread is running");
        });
        thread.start();
    }
}
