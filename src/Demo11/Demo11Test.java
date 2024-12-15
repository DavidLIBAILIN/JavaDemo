package Demo11;

public class Demo11Test {

    private static void myMethod(int n) throws MyException {
        if (n > 10) {
            throw new MyException(n);
        } else {
            System.out.println(n);
        }
    }
    public static void main(String[] args){
        try {
            myMethod(10);
        } catch (MyException e) {
            System.out.println("My Exception: " + e);
        }
    }
}
