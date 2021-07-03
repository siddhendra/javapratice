import java.util.ArrayList;

public class replacearray {
    public static void main(String[] args) {
        ArrayList<Double> al = new ArrayList<Double>();
        al.add(10.5d);
        al.add(12.8d);
        al.add(15.2);
        System.out.println(al);
        al.set(2, 15.6d);
        System.out.println(al);
    }
    
}
