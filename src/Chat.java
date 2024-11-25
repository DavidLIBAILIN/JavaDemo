public class Chat {
    boolean flag = false;

    public synchronized void question(String msg) throws InterruptedException {
        if (flag) {
            wait();
        }
        System.out.println(msg);
        Thread.sleep(2000);
        flag = true;
        notify();
    }

    public synchronized void answer(String msg) throws InterruptedException {
        if (!flag) {
            wait();
        }
        System.out.println(msg);
        Thread.sleep(1000);
        flag = false;
        notify();
    }
}
