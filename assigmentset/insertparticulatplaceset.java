import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class insertparticulatplaceset {
    public static void main(String[] args) {
        Set<Integer> hs = new HashSet<>();
        hs.add(100);
        hs.add(200);
        hs.add(300);
        hs.add(400);
        System.out.println(hs);
        List<Integer> al = new ArrayList<>(hs);
        al.add(2,500);
        System.out.println(al);
    }
    
}
