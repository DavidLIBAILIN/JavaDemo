package Demo11;

public class MyException extends Exception{
    private int detail;
    public MyException(int detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return " My Exception: " + "{" + detail + "}";
    }

}
