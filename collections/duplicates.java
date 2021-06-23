import java.util.ArrayList;
import java.util.List;

public class duplicates {
    public static void main(String[] args) {
        List<Character> al = new ArrayList<Character>();
        al.add('s');
        al.add('i');
        al.add('d');
        al.add('m');
         
        List<Character> al1 = new ArrayList<Character>();
        al1.add('s');
        al1.add('i');
        al1.add('d');
        al1.add('u');
        al.removeAll(al1);
        System.out.println(al);
    }
    
}
