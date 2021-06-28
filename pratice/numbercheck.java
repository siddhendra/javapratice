import jdk.internal.net.http.common.MinimalFuture;

public class numbercheck {
    public static void main(String[] args) {
        int number=-100;
        if(number>0)
        {
            System.out.println("given number is positive");
        }
        else if(number<0)
        {
            System.out.println("given number is negative");
        }
        else 
        {
            System.out.println("number is neither positive or negivate");
        }
    }
    
}
