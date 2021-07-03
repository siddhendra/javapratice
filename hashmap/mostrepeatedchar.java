import java.util.LinkedHashMap;
import java.util.Map;

public class mostrepeatedchar {
    public static void main(String[] args) {
        String s="civicisclcmc";
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
        Character ky=' ';
        Integer i=0;
        for(Map.Entry<Character,Integer> me:lhm.entrySet())
        {
            if(me.getValue()>i)
            {
                ky=me.getKey();
                i=me.getValue();

            }
        }
        System.out.println(ky+"-"+i);
    }
    
}
