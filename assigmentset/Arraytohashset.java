import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Arraytohashset {
    public static void main(String[] args) {
        String[] str={"q","w","e","r"};
        Set<String> hs = new HashSet<>();
        for(String temp:str)
        {
            hs.add(temp);

        }
        System.out.println(hs);
    }
    
}
