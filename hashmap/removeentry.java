import java.util.TreeMap;

public class removeentry {
    public static void main(String[] args) {
        TreeMap<String, Integer> t1 = new TreeMap<String, Integer>();
        t1.put("c",02);
        t1.put("h",12);
        t1.put("o",22);
        t1.put("w",32);
        t1.remove("d");
        System.out.println(t1);
    }
    
}
