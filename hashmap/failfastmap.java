import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class failfastmap
 {
     public static void main(String[] args) {
         Map<String, Integer> m = new ConcurrentHashMap<String, Integer>();
         m.put("A", 69);
         m.put("B", 68);
         m.put("C", 67);
         for(Map.Entry<String, Integer> me:m.entrySet())
         {
             System.out.println(me .getKey()+"-"+me.getValue());
             m.put("D", 66);
         }
     }
    
}
