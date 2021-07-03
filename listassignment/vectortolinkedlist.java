import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class vectortolinkedlist {
public static void main(String[] args) {
    Vector<Character> v = new Vector<>();
    v.add('z');
    v.add('x');
    v.add('c');

    List<Character> ll = new LinkedList<>(v);
    System.out.println(ll);
}    
}
