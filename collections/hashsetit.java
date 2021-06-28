import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashsetit {
    public static void main(String[] args) {
     Set<String> hs = new HashSet<String>();
     hs.add("sid");
     hs.add("siddu");
     hs.add("sidhu");
     hs.add(null);
     hs.add("sid");
     Iterator<String> i = hs.iterator();
     while(i.hasNext())
     {
         System.out.println(i.next());
     }
    }
    
}
