// private static methods
interface Sayable {
    default void say() {
        saySomething();
        sayPolitely();
    }

    private void saySomething() {
        System.out.println("Hello...I'm private Method");
    }

    private static void sayPolitely() {
        System.out.println("I am politely");
    }
}

public class StaticMethod implements Sayable {
    public static void main(String[] args) {
        Sayable s = new StaticMethod();
        s.say(); 
    }
}
