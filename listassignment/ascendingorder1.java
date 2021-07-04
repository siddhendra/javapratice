import java.util.ArrayList;
import java.util.Collections;

public class ascendingorder1
 {
public static void main(String[] args) {
    ArrayList<String> al = new ArrayList<>();
    al.add("hi");
    al.add("am");
    al.add("siddu");
    al.add("from");
    al.add("hyd");
    System.out.println("before sort: "+ al);
    Collections.sort(al);
    System.out.println("after sort: "+ al);
}    
}
