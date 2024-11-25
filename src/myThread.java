public class myThread implements Runnable{


    public static void main (String[] args) {
        myThread t1 = new myThread();
    }

    @Override
    public void run() {
        System.out.println("The thread is running");
    }
}