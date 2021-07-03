import java.util.ArrayList;

public class onearraytoanother {
    public static void main(String[] args) {
        ArrayList<Character> al = new ArrayList<Character>();
        al.add('s');
        al.add('i');
        al.add('d');
        al.add('h');
        al.add('u');
        ArrayList<Character> al1 = new ArrayList<>(al);
        for(Character temp:al1)
        System.out.println(temp);
    }

    
}
