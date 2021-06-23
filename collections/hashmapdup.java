import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class hashmapdup {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(50);
        al.add(80);

        al.add(10);
        al.add(50);
        al.add(90);
        System.out.println(al);
        Set<Integer> hs = new HashSet<Integer>(al);
        System.out.println(hs);
        
    }
    
}
