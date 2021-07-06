package TestJava;

public class classload {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException
    {
        Class fn = Class.forName("TestJava.classload");
        System.out.println(fn.getClass().getName());
        
    }
    
}
