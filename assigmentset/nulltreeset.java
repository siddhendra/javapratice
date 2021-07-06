import java.util.Set;
import java.util.TreeSet;

public class nulltreeset {
    public static void main(String[] args) {
        Set<Integer> ts = new TreeSet<>();
        ts.add(101);
        ts.add(201);
        ts.add(301);
        ts.add(401);
        ts.add(null);
        System.out.println(ts);
    }
    
}
