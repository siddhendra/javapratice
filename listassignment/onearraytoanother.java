import java.util.ArrayList;
import java.util.List;

public class onearraytoanother {
    public static void main(String[] args) {
        List<Character> al = new ArrayList<Character>();
        al.add('s');
        al.add('i');
        al.add('d');
        al.add('h');
        al.add('u');
        System.out.println(al);
        List<Character> al1 = new ArrayList<>();
        for( int i=0 ; i<=al.size()-1; i++)
        {
                al1.add(al.get(i));

        }
        System.out.println(al1);
    
        /*for(Character value:al1)
        {
            System.out.println(value);
        }*/
    }

    
}
