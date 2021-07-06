import java.util.HashSet;
import java.util.Set;

import javax.swing.text.html.StyleSheet;

public class hashsettoarray {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        hs.add("e");
        hs.add("a");
        hs.add("t");
        String[] a = hs.toArray(new String[hs.size()]);
        for(String temp:a)
        {
            System.out.println(temp);
        }
    }
    
}
