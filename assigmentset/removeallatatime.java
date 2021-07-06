import java.util.LinkedHashSet;
import java.util.Set;

public class removeallatatime {
    public static void main(String[] args) {
        Set<Character> lhs = new LinkedHashSet<>();
        lhs.add('s');
        lhs.add('h');
        lhs.add('o');
        lhs.add('r');
        lhs.add('t');
        lhs.clear();
        System.out.println(lhs.size());
    }
    
}
