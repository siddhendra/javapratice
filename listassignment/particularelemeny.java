import java.util.ArrayList;

public class particularelemeny {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        Integer num=100;
        al.add(10);
        al.add(50);
        al.add(60);
        al.add(90);
        boolean flag = al.contains(num);
        if(flag)
        {
            System.out.println("element exist");
        }
        else
        {
            System.out.println("element doesn't exist");
        }

    }
    
}
