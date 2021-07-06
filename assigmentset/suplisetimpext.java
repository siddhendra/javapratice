import java.util.HashSet;
import java.util.Set;

public class suplisetimpext {
    public static void main(String[] args) 
	{

		duplisetimple e1=new duplisetimple(100,"A");
		duplisetimple e2=new duplisetimple(100,"A");
		
		Set<duplisetimple> st=new HashSet<duplisetimple>();
		st.add(e1);
		st.add(e2);
		System.out.println(st.size());
	}
    
}
