public class TestThread {
    public static void main(String[] args) {
        System.out.println("Thread main started");
        final Task task = new Task();
        final Thread thread = new Thread(task);
        thread.start();
        System.out.println("Start Ends");
        thread.interrupt(); // calling interrupt() method
        System.out.println("Interrupt Ends");
        System.out.println("Main Thread finished");
        thread.interrupt(); // calling interrupt() method
    }
}
class Task implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("[" + Thread.currentThread().getName() + "] Message " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("This thread was interruped by someone calling this Thread.interrupt()");
            }
        }
    }
}
