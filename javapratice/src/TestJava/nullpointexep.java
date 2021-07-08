package TestJava;

public class nullpointexep {
    public static void main(String[] args) {
        String s=null;
        if(s!=null)
        {
            System.out.println(s.length());
        }
        else
        {
            System.out.println("assign some value to String");
        }
    }
    
}
