import java.security.Policy;

public class policysingleton {
    static policy p=null;
        private policysingleton()
        {

        }
        public static policy getInstance()
        {
            if(p==null)
            {
                p=new policy();

            }
            return p;
        }
    
}
