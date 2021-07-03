import java.util.ArrayList;
import java.util.Iterator;

public class arraylistfailfast {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("s");
        al.add("i");
        al.add("d");
        Iterator<String> i = al.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
            al.add("m");
        }
    }
    
}
