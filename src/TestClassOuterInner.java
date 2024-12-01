public class TestClassOuterInner {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass.print();
    }
}

class OuterClass{
    static class InnerClass{
        public static void print() {
            System.out.println("Inner Class!!!!!");
        }
    }
}
