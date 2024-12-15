package Multithread;

import java.util.concurrent.Callable;

public class TestCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "New thread";
    }
}
