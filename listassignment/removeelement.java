import java.util.ArrayList;
import java.util.List;

public class removeelement {
    public static void main(String[] args) {
        List<Character> al = new ArrayList<Character>();
        al.add('s');
        al.add('i');
        al.add('d');
        al.add('m');
        System.out.println(al);
        al.remove(0);
        System.out.println(al);
    }
    
}
