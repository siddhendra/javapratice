import java.util.TreeMap;

public class replacemap {
    public static void main(String[] args) {
        TreeMap<String, Integer> mt = new TreeMap<String, Integer>();
        mt.put("b",04);
        mt.put("i",14);
        mt.put("n",24);
        mt.put("d",34);
        mt.put("u",44);
        mt.replace("u",54);
        System.out.println(mt);
    }
    
}
