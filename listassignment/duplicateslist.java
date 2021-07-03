import java.util.ArrayList;
import java.util.List;

public class duplicateslist {
    public static void main(String[] args) {
        List<String> al = new ArrayList<String>();
        List<String> uniquelist = new ArrayList<String>();
        al.add("siddu");
        al.add("ram");
        al.add("suresh");
        al.add("siddu");
        for(String temp:al)
        {
            if(!uniquelist.contains(temp))
            {
                uniquelist.add(temp);
            }
        }
System.out.println(uniquelist);
    }
    
}
