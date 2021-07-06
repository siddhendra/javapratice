import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class readonlyset {
    public static void main(String[] args) {
        Set<Character> ts = new LinkedHashSet<>();
        ts.add('b');
        ts.add('a');
        ts.add('g');
        Set<Character> ums = Collections.unmodifiableSet(ts);
        ums.add('s');
        System.out.println(ums);
    }
    
}
