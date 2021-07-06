import java.util.HashSet;

public class isemptyhashset {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(100);
        hs.add(200);
        hs.add(300);
        hs.add(400);
        boolean flag = hs.isEmpty();
        if(flag)
        {
            System.out.println("hashset is empty");
        }
        else
        {
            System.out.println("hashset is not empty");
        }
    }
    
}
