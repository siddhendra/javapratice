import java.util.TreeMap;

public class particularkey {
    public static void main(String[] args) {
        TreeMap<String, Integer> t = new TreeMap<String, Integer>();
        String ky="a";
        t.put("k",100);
        t.put("e",200);
        t.put("y",300);
        boolean flag= t.containsKey(ky);
        if(flag)
        {
            System.out.println("key exists");

        }
        else
        {
            System.out.println("keys are not exists");
        }


    }
    
}
