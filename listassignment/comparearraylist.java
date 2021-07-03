import java.util.ArrayList;
import java.util.List;

public class comparearraylist {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(40);
    
        ArrayList<Integer> al2 = new ArrayList<Integer>();
        al2.add(10);
        al2.add(20);
        al2.add(40);
        al2.add(30);
        boolean flag = al.equals(al2);
        if(flag)
        {
            System.out.println("two arraylists are equal");
        }
        else
        {
            System.out.println("two arraylists are not equal");
        }


    }
    
}
