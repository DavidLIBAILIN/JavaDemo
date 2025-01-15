package a05interfacedemo5;

public class PingpongCoach extends Coach implements English{
    @Override
    public void teach() {
        System.out.println("Pingpong coach is teaching...");
    }

    @Override
    public void speakEnglish() {
        System.out.println("speaking english");
    }

    public PingpongCoach() {
    }

    public PingpongCoach(String name, int age) {
        super(name, age);
    }
}
