package DEC16Review;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyThread myThread = new MyThread();
        FutureTask<Integer> integerFutureTask = new FutureTask<>(myThread);

        Thread thread = new Thread(integerFutureTask, "A");
        thread.start();

        Integer i = integerFutureTask.get();
        System.out.println(i);
    }
}

class MyThread implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        return 1024;
    }
}
