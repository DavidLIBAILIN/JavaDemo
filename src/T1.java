public class T1 implements Runnable{

    Chat m;
    String[] s1 = { "Hi", "How are you ?", "I am also doing fine!" };

    public T1(Chat m1) {
        this.m = m1;
        new Thread(this, "Question").start();
    }

    @Override
    public void run() {
        for (int i = 0; i < s1.length; i++) {
            try {
                m.question(s1[i]);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
