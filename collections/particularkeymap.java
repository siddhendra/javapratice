import java.util.HashMap;

public class particularkeymap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        String ky="D";
        hm.put("c",20);
        hm.put("s",15);
        hm.put("D",52);
        boolean flag = hm.containsKey(ky);
        if(flag)
        {
            System.out.println("key exists");
        }
        else
        {
            System.out.println("key doesn't exist");
        }
    }
    
}
