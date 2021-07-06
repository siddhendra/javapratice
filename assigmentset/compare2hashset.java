import java.util.HashSet;
import java.util.Set;

public class compare2hashset {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        hs.add("s");
        hs.add("a");
        hs.add("i");
        
        Set<String> hs1 = new HashSet<>();
        hs1.add("s");
        hs1.add("a");
        hs1.add("i");
        boolean flags = hs.equals(hs1);
        if(flags)
        {
            System.out.println("2 hashset are equal");
        }
        else{
            System.out.println("2 hashsets are not equal");
        }
    }
    
    
}
