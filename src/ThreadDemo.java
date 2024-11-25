class ThreadDemo extends Thread {
    private Thread t;
    private String threadName;

    ThreadDemo(String threadName) {
        this.threadName = threadName;
    }

    public void run() {
        PrintDemo.printDemo();
        System.out.println("Thread " + threadName + "Done");
    }
}
