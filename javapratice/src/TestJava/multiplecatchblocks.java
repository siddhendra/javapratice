package TestJava;

public class multiplecatchblocks {
    public static void main(String[] args) {
        int a=5;
        int result=0;
        try
        {
            result=a/0;

        }
        catch(NullPointerException e)
        {
            System.out.println("nullPointerException");
        }
        catch(ArithmeticException e)
        {
            System.out.println("arithmeticexception");
        }
        catch(NumberFormatException e)
        {
        System.out.println("nameformatexception");
        }
        catch(Exception e)
        {
            System.err.println("Exception");
        }
    }
    
}
