import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class listiteratorset {
    public static void main(String[] args) {
        Set<Integer> lhss = new TreeSet<>();
        lhss.add(77);
        lhss.add(177);
        lhss.add(277);
        lhss.add(377);
        lhss.add(477);
        ArrayList<Integer> al = new ArrayList<>(lhss);
        Iterator<Integer> i = al.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
    
}
