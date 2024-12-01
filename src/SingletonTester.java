class Singleton{
    private static Singleton instance = new Singleton();
    private Singleton(){}
    public static Singleton getInstance(){
        return instance;
    }
    protected void demoMethod() {
        System.out.println("demoMethod");
    }
}

public class SingletonTester {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        s1.demoMethod();
    }
}
