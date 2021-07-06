import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class copyOnWriteSet {
    public static void main(String[] args) {
     Set<Integer> lhs = new CopyOnWriteArraySet<>();
     lhs.add(88);
     lhs.add(188);
     lhs.add(288);
     lhs.add(388);
     Iterator<Integer> i = lhs.iterator();
     while(i.hasNext())
     {
         System.out.println(i.next());
         lhs.add(488);
     }
    }
    
}
