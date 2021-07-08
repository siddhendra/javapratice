package TestJava;

public class numberformatexce {
    public static void main(String[] args) {
        String s="vj";
        try
        {
            int result = Integer.parseInt(s);
            System.out.println(result);
        }
        catch(NumberFormatException e)
        {
         System.out.println("don't convert string into int");
        }
    }
    
}
