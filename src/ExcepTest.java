public class ExcepTest {
    public static void main(String[] args) {
        try {
            int b = 0;
            int c = 1/b;;
            System.out.println("c: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Exception thrown: " + e.toString());
        }
        System.out.println("Out of block");
    }
}
