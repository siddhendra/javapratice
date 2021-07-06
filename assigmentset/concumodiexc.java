import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class concumodiexc {
    public static void main(String[] args) {
        Set<Integer> lhs = new LinkedHashSet<>();
        lhs.add(99);
        lhs.add(199);
        lhs.add(299);
        lhs.add(399);
        lhs.add(499);
        lhs.add(599);
        Iterator<Integer> i = lhs.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
            lhs.add(699);
        }
    }
    
}
