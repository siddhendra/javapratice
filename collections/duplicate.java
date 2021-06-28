import java.util.HashSet;
import java.util.Set;

public class duplicate {
    public static void main(String[] args) {
        Set<userdefineddupset> hm = new HashSet<userdefineddupset>();
      hm.add(new userdefineddupset(101,"siddu"));
      hm.add(new userdefineddupset(102,"sid"));
      hm.add(new userdefineddupset(101,"siddu"));
      System.out.println(hm);
    }
    
}
