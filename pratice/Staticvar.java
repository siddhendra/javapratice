public class Staticvar {
    
        private static String iit;
        int eno;
        String ename;
        static String ecollegename=iit;
   
    public Staticvar(int eno, String ename) {
        this.eno = eno;
        this.ename = ename;
    
    }

    void display()
    {
        System.out.println(eno+"-"+ename+"-"+ecollegename);
        
    }
     

    
}
