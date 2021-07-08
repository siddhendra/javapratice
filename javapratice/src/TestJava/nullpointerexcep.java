package TestJava;

public class nullpointerexcep {
    public static void main(String[] args) {
        String s=" ";
       try
       {
           System.out.println(s.length());
       }
       catch(NullPointerException w)
       {
           System.out.println("assign some value to string");
       }
    }
    
}
