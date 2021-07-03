import java.util.LinkedHashMap;
import java.util.Map;

public class occuofeachchar {
    public static void main(String[] args) {
        String s="Siddu";
        char[] ch = s.toCharArray();
        LinkedHashMap<Character, Integer> hm = new LinkedHashMap<Character, Integer>();
        for(char temp:ch)
        {
            if(hm.containsKey(temp))
            {
                hm.put(temp,hm.get(temp)+1);

            }
            else
            {
                hm.put(temp,1);
            }
        }
        for(Map.Entry me:hm.entrySet())
        {
            System.out.println(me.getKey()+"-"+me.getValue());
        }
    }
    
}
