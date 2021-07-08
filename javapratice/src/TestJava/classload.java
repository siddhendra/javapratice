package TestJava;

public class classload {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException
    {
        try
        {
            
            Class.forName("TestJava.classload");
            System.out.println("i am from try block");
            System.exit(0);
        }
        catch(ClassNotFoundException e)
        {
              System.out.println("class not found "+e);
              System.exit(0);
        }
       finally
       {
           System.out.println("i am from final block");
       }
        
    }
    
}
