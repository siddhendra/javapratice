import java.util.ArrayList;
import java.util.List;

public class particularelementarraylist {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();
        al.add("q");
        al.add("w");
        al.add("e");
        al.add("r");
        String s = al.get(3);
        System.out.println(s);
    }
    
}
