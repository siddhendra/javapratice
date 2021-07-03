import java.util.TreeMap;

public class particularvalue {
    public static void main(String[] args) {
        TreeMap<String, Integer> m = new TreeMap<String, Integer>();
        Integer num=56;
        m.put("s",06);
        m.put("i",16);
        m.put("d",26);
        boolean flag = m.containsValue(num);
        if(flag)
{
    System.out.println("value exists");
}
else
{
    System.out.println("value not exists");
}
    }
    
}
