

public class driver {

    public static void main(String[] args)
      {
        policy p1=policysingleton.getInstance();
		policy p2=policysingleton.getInstance();
		policy p3=policysingleton.getInstance();
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
      }
}
