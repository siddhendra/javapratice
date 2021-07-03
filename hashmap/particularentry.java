import java.util.TreeMap;

public class particularentry {
    public static void main(String[] args) {
        TreeMap<String, Integer> m1 = new TreeMap<String, Integer>();
        m1.put("b",11);
        m1.put("a",22);
        m1.put("c",33);
        m1.put("k",44);
        Integer i = m1.get("k");
        System.out.println(i);
    }
    
}
