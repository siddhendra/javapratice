import java.util.ArrayList;
import java.util.List;

public class reversearraylist {
    public static void main(String[] args) {
        List<String> al1 = new ArrayList<String>();
        List<String> al2 = new ArrayList<String>();
        al1.add("siddu");
        al1.add("ram");
        al1.add("suresh");
        al1.add("manoj");
        System.out.println("original arralist:" + al1);
        for( int i=al1.size()-1;i>=0;i--)
        {
            al2.add(al1.get(i));

        }
        
      System.out.println("reserved arraylist:" +al2);

    }
    
}
