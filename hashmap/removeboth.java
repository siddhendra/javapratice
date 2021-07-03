import java.util.TreeMap;

public class removeboth {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm1 = new TreeMap<String, Integer>();
        tm1.put("a",03);
        tm1.put("k",13);
        tm1.put("h",23);
        tm1.put("i",33);
        tm1.put("l",43);
        tm1.remove("l",43);
        System.out.println(tm1);
    }
    
}
