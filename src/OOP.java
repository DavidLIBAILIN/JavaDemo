public class OOP {
    static int a;
    {
        System.out.println("Inside instance initializer block");
        a = 10;
    }

    OOP(){
        System.out.println("Inside constructor");
        a = 20;
    }

    public static void main(String[] arguments) {
        OOP test = new OOP();
        System.out.println("Value of a: " + a);
    }
}




