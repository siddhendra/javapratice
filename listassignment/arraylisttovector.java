import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class arraylisttovector {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();
        al.add("a");    
        al.add("s");
        al.add("d");

        Vector<String> v = new Vector<>(al);
        System.out.println(v);
    }
    
}
