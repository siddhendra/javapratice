import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class synchronizedlinkedlist {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("j");
        ll.add("u");
        ll.add("l");
        ll.add("y");
        List<String> sl = Collections.synchronizedList(ll);
        System.out.println(sl);
    }
    
}
