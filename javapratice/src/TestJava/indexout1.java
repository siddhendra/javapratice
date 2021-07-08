
package TestJava;

public class indexout1 {
    public static void main(String[] args) {
        String s="siddu";
        try{
            System.out.println(s.charAt(2));
        }
        catch(StringIndexOutOfBoundsException i)
        {
            System.out.println("don't pass invalid index");
        }
    }
    
}
