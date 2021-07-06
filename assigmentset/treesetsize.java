import java.util.Set;
import java.util.TreeSet;

public class treesetsize {
    public static void main(String[] args) {
        Set<String> ts = new TreeSet<>();
        ts.add("p");
        ts.add("u");
        ts.add("b");
        System.out.println(ts.size());
    }
}
