package Multithread;

public class TestJoin implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("thread vip is comming ..." + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        TestJoin testJoin = new TestJoin();
        Thread t1 = new Thread(testJoin);
        t1.start();

        for (int i = 0; i < 300; i++) {
            if (i == 200) {
                t1.join();
            }
            System.out.println("main: " + i);
        }
    }
}
