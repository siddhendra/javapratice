import java.util.HashMap;
import java.util.Map;

public class userdefinedmapext {
    public static void main(String[] args) {
        Map<userdefineddupset, String> h = new HashMap<>();
        userdefineddupset us1 = new userdefineddupset(1, "siddu");
        userdefineddupset us2 = new userdefineddupset(1, "siddu");
        h.put(us1, "emp1");
        h.put(us2, "emp2");
        System.out.println(h);
        System.out.println("size is: "+h.size());
    }
    
}
