import java.util.HashMap;

public class hashmap2object {
    public static void main(String[] args) {
        HashMap<employ,String> hm1 = new HashMap<>();
        employ e1= new employ(25, "raj");
        employ e2=new employ(25, "raj");
        hm1.put(e1, "emp1");
        hm1.put(e2, "emp2");
        System.out.println(hm1);
        System.out.println("size is:"+hm1.size());
    }
    
}
