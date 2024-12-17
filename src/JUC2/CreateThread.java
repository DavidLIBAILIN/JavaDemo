package JUC2;

class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("The thread is running");
    }
}
public class CreateThread {

    public static void main(String[] args) {
        Thread thread = new MyThread();
        thread.start();
    }
}
