import java.util.ArrayList;
import java.util.List;

public class arraylistisempty {
    public static void main(String[] args) {
        List<Character> a = new ArrayList<>();
        a.add('b');
        a.add('n');
        a.add('m');
        boolean flag = a.isEmpty();
        if(flag)
        {
            System.out.println("ArrayList is empty");

        }
        else
        {
            System.out.println("ArrayList is not empty");
        }

    }
    
}
