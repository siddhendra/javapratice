import java.util.ArrayList;


public class arraylisttoarray {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("s");
        al.add("i");
        al.add("d");
        al.add("h");
        al.add("u");
        String[] a = al.toArray(new String[al.size()]);
        for(String temp:a)
        {
            System.out.println(temp);
        }
    }
    
}
