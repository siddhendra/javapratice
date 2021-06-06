import java.lang.reflect.Array;

public class methods {
    public static void main(String[] args) {
        String s = "siddhendra chowdary";
       char[] ch =  new char[20];
       s.getChars(8, 15, ch, 0);
       System.out.println(ch);

      
    }

}
