interface Animal {
    void eat();
    default void sleep() {
        System.out.println("Sleeping...");
    }

    static void call() {
        System.out.println("Calling...");
    }
}


public class Mammal implements Animal{
    @Override
    public void eat() {
        System.out.println("Mammal eats");
    }


    public static void main(String[] args) {
        Mammal m = new Mammal();
        m.eat();
        m.sleep();
        Animal.call();
    }
}
