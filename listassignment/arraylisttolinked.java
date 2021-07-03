import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class arraylisttolinked {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(25);
        al.add(50);
        al.add(75);
        al.add(100);

        List<Object> ll = new LinkedList<>(al);
        System.out.println(ll);
        
    }
    
}
