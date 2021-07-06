import java.util.HashSet;
import java.util.Set;

import javax.swing.text.html.StyleSheet;

public class appendatendofset {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        hs.add("g");
        hs.add("u");
        hs.add("n");
        boolean flag = hs.add("s");
        System.out.println("inserted successful: "+flag);
        for(String temp:hs)
        {
            System.out.println(temp);
        }
    }
    
}
