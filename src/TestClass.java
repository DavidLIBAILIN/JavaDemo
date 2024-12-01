interface Message {
    String greet();
}

public class TestClass {

    public void printMessage(Message m) {
        System.out.println(m.greet() + "!!!!!!");
    }

    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        testClass.printMessage(new Message() {
            public String greet() {
                return "Hello World";
            }
        });
    }
}
