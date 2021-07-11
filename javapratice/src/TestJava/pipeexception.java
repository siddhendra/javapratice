package TestJava;

public class pipeexception {
    int a=10;
    int b=0;
    int result;
    public void disp()
    {
        try
        {
            result=a/b;
        }
        catch(ArithmeticException | NumberFormatException e)
        {
            System.out.println("Arithmeticexception");
        }
    }
    
}
