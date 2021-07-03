import java.util.HashMap;

public class userdefinedmapext {
    public static void main(String[] args) {
        HashMap<userdefineddupset, String> h = new HashMap<>();
        userdefineddupset us1 = new userdefineddupset(10, "siddu");
        userdefineddupset us2 = new userdefineddupset(10, "siddu");
        h.put(us1, "hello");
        h.put(us2, "hi");
        System.out.println(h);
        System.out.println(h.size());
    }
    
}
