import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class readonlyvector {
    public static void main(String[] args) {
        Vector<Integer > v = new Vector<>();
        v.add(100);
        v.add(200);
        v.add(300);
        List<Integer> ul = Collections.unmodifiableList(v);
        System.out.println(ul);
        ul.add(400);
        
    }
    
}
