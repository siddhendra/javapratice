package TestJava;

public class trybetcatch {
    public static void main(String[] args) {
        try
        {
            Class.forName("TestJava.trybetcatch");
            System.out.println("i am from try block");
            System.exit(0);
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("class not found "+e);
            System.exit(0);
        }
    }
    
}
