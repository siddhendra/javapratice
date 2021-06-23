import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("s");
        al.add("i");
        al.add("d");
        String[] a = al.toArray(new String[al.size()]);
        for(String temp:a)
        {
            System.out.println(temp);
        }
    }
    
}
