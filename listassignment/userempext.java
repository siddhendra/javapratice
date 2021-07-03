
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class userempext {
    public static void main(String[] args) {
        Vector<useremp> al = new Vector<useremp>();
        al.add(new useremp(10  ,"sid"));
        al.add(new useremp(20, "siddu"));
        Iterator<useremp> i = al.iterator();
        while(i.hasNext())
        {
            useremp e = i.next();
            System.out.println(e.getEid()+"-"+e.getEname());
        }
    }
    
}
