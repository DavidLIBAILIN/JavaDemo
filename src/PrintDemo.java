class PrintDemo {
    public static synchronized void printDemo() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Counter -- " + i);
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted");
        }
    }
}