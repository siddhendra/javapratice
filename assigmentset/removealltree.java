import java.util.Set;
import java.util.TreeSet;

public class removealltree {
    public static void main(String[] args) {
        Set<Character> ts = new TreeSet<>();
        ts.add('w');
        ts.add('a');
        ts.add('t');
        ts.add('c');
        ts.add('h');
        ts.clear();;
        System.out.println(ts.size());
    }
    
}
