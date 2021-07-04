import java.util.ArrayList;
import java.util.Collections;

public class descendingorder1 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("hi");
        al.add("am");
        al.add("siddu");
        al.add("from");
        al.add("hyd");
        al.add("tele");
        System.out.println("before sorting: "+al);
        Collections.sort(al, Collections.reverseOrder());
        System.out.println("after sorting: "+ al);

    }
    
}
