import java.util.ArrayList;
import java.util.List;

public class firstoccurance {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<Integer>();
        al.add(20);
        al.add(40);
        al.add(60);
        al.add(80);
        System.out.println("initial content of list");
        System.out.println("first occurance of element is : "+al.get(0));
        System.out.println("last occurance of element is: "+al.get(al.size()-1));
    }
    
}
