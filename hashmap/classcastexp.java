import java.util.Map;
import java.util.TreeMap;

public class classcastexp {
    public static void main(String[] args) {
        Map m = new TreeMap();
        m.put("s",20);
        m.put("i",30);
        m.put("d",40);
        m.put(10,true);
        System.out.println(m);
    }
    
}
