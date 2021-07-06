import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetNull {
    public static void main(String[] args) {
        Set<Integer> lhs = new LinkedHashSet<>();
        lhs.add(null);
        lhs.add(122);
        lhs.add(133);
        System.out.println(lhs);
    }
    
}
