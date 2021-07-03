import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class linkedlistfailfast {
    public static void main(String[] args) {
        List<String> ll = new LinkedList<>();
        ll.add("d");
        ll.add("e");
        ll.add("l");
        ll.add("L");
        Iterator<String> i = ll.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
            ll.add("s");
        }
    }
    
}
