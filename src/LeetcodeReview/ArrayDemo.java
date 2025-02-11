class Foo {

    private Boolean first = false;
    private Boolean second = false;

    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        synchronized(this){
            printFirst.run();
            first = true;
            notifyAll();
        }
    }

    public void second(Runnable printSecond) throws InterruptedException {
        synchronized(this){
            if(!first){
                wait();
            }
            // printSecond.run() outputs "second". Do not change or remove this line.
            printSecond.run();
            second = true;
            notifyAll();
        }
    }

    public void third(Runnable printThird) throws InterruptedException {

        // printThird.run() outputs "third". Do not change or remove this line.
        synchronized(this){
            while(!second){
                wait();
            }
            printThird.run();
        }
    }
}