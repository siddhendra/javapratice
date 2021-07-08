package TestJava;

public class childext {
    public static void main(String[] args) {
        child c = new child();
        try
        {
            c.disp();
        }
        catch(ClassNotFoundException e)
        {
System.out.println("exceptionhandling");
        }
    }
    
}
