import java.util.HashSet;
import java.util.Set;

public class emp5ext {
    public static void main(String[] args) 
	{

		emp5 e1=new emp5(100,"A");
		emp5 e2=new emp5(100,"A");
		
		Set<emp5> st=new HashSet<emp5>();
		st.add(e1);
		st.add(e2);
		System.out.println(st.size());
	}
    
}
