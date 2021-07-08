package TestJava;

public class exception {
    int a=10;
    int result=0;
    public void disp()
    {
        try
        {
            result=a/0;
        }
        catch(Exception e)
        {
System.out.println("Exception");
        }
    }
    
}
