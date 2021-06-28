public class Staticblockchild {
    static{
        System.out.println("static block of child class");
    }
    public void display()
    {
        System.out.println("Just a method of child class");
    }
    public static void main(String args[])
    {
        StaticDemoChild obj = new StaticDemoChild();
        obj.display();
    }
}
    
