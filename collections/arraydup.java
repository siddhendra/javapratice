import java.util.ArrayList;
import java.util.List;

public class arraydup {
    public static void main(String[] args) {
        List<String> al = new ArrayList<String>();
        List<Object> al1 = new ArrayList<>();
        al.add("s");
        al.add("i");
        al.add("d");
        al.add("d");
        al.add("u");
        for( String s:al)
        {
            if(!al1.contains(s))
            {
                al1.add(s);

            }


        }
        System.out.println(al1);
    }
    
}
