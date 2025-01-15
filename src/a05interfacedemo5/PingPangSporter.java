package a05interfacedemo5;

public class PingPangSporter extends Sporter implements English{
    @Override
    public void speakEnglish() {
        System.out.println("Speaking English");
    }

    @Override
    public void study() {
        System.out.println("Studying playing pingpong");
    }

    public PingPangSporter(String name, int age) {
        super(name, age);
    }

    public PingPangSporter() {
    }
}
