interface sayable {
    void say(String msg);

    default void sayOtherThing(String otherMsg) {
        System.out.println("Other");
    }
}

interface talkShit extends sayable{
    void talkShit(String shitMsg);
    default void say(String msg) {
        System.out.println(msg);
    }
    default void sayOtherShit(String otherShit) {
        System.out.println("Other Shit");
    }
}

public class FunctionalInterfaceExample implements talkShit{



    public static void main(String[] args) {
        FunctionalInterfaceExample fie = new FunctionalInterfaceExample();
        fie.say("Hello there!");
        fie.sayOtherThing("Yes");
        fie.talkShit("Shit!");
        fie.sayOtherShit("Shitt!");
    }

    @Override
    public void talkShit(String shitMsg) {
        System.out.println("This is a shit talk");
    }
}
