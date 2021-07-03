import java.util.ArrayList;
import java.util.List;

public class mergearraaylists {
    public static void main(String[] args) {
        List<Integer> al1 = new ArrayList<Integer>();
        al1.add(10);
        al1.add(50);
        al1.add(70);
        List<Integer> al2 = new ArrayList<Integer>();
        al2.add(90);
        al2.add(60);
        al2.add(20);
        al1.addAll(al2);
        System.out.println(al1);
    }
    
}
