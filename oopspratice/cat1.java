import jdk.internal.jshell.tool.resources.version;

public class cat1 extends animal1 {
    public void sound()
    {
        System.out.println("meow");

    }
    public static void main(String[] args) {
        animal1 a1=new cat1();
        a1.sound();
    }
}
