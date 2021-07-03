import java.util.Hashtable;
import java.util.Map;

public class mapentry {
    public static void main(String[] args) {
        Map<String,Integer> ht = new Hashtable<String,Integer>();
        ht.put("s", 10);
        ht.put("d", 11);
        ht.put("f", 12);
        ht.put("g", 13);
        for(Map.Entry<String, Integer> me:ht.entrySet())
{
    System.out.println(me.getKey()+"-"+me.getValue());
}

    }
    
}
