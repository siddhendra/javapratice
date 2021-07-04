import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class unsupported
 {
    public static void main(String[] args) 
	{
		List<String> l1=new ArrayList<String>();
		l1.add("Gayatri");
		l1.add("Sowjanya");
		l1.add("Priyanka");
		List<String> unmodifiableList = Collections.unmodifiableList(l1);
		unmodifiableList.add("Praveen");
		
	}
}    
