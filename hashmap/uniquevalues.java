import java.util.LinkedHashMap;
import java.util.Map;

public class uniquevalues {
    public static void main(String[] args) {
        String s="civic";
        char[] ch = s.toCharArray();
      Map<Character,Integer> lhm = new LinkedHashMap<>();
      for(char c:ch)
      {
          if(lhm.containsKey(c))
          {
              lhm.put(c,lhm.get(c)+1);

          }
          else
          {
              lhm.put(c,1);
          }

      }
      for(Map.Entry<Character,Integer> me:lhm.entrySet())
      {
          if(me.getValue()>1)
          {
              System.out.println(me.getKey()+"-"+me.getValue());
        break;
          }
      }
    }
    
}
