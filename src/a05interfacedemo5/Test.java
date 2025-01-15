package a05interfacedemo5;

public class Test {
    public static void main(String[] args) {
        PingPangSporter pps = new PingPangSporter("LSW", 23);
        System.out.println(pps.getName() + ", " + pps.getAge());
        pps.study();
        pps.speakEnglish();
    }
}
