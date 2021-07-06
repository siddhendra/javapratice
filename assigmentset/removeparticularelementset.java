import java.util.HashSet;

public class removeparticularelementset {
public static void main(String[] args) {
    HashSet<String> hs = new HashSet<>();
    hs.add("r");
    hs.add("a");
    hs.add("m");
    hs.remove("m");
    System.out.println(hs);
}    
}
