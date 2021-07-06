import java.util.HashSet;

public class particularelementset {

    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        Integer num=899;
        hs.add(199);
        hs.add(299);
        hs.add(399);
        hs.add(499);
        boolean flag = hs.contains(num);
        if(flag)
        {
            System.out.println("element exists");
        }
        else
        {
            System.out.println("elememt does not exists");
        }
    }
}
