public class StaticDemoChild extends StaticDemo {
    public StaticDemoChild()
    {
         System.out.println("StaticDemoChild");
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
