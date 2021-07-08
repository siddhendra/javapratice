package TestJava;

public class arthimeticexception {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int result=0;
        try
        {
            result=a/b;
        }
        catch(ArithmeticException A)
        {
            System.out.println("exception is solved");
        }
        System.out.println("result "+result);
    }
    
}
