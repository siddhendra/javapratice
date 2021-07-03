import java.util.Map;
import java.util.TreeMap;

public class treemapput {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
        tm.put("h",100);
        tm.put("b",200);
        tm.put("c",300);
        tm.put("d",400);
        for(Map.Entry<String,Integer> me:tm.entrySet())
        {
            System.out.println(me.getKey()+"-" +me.getValue());
        }
    }
    
}
