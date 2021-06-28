public class parameterizedconstructor {
    int eid;
    String ename;
    public parameterizedconstructor(int eid, String ename) {
        this.eid = eid;
        this.ename = ename;
    }
      public void disp()
      {
          System.out.println("id: "+eid+" name :"+ename);
      }
      public static void main(String[] args) {
          parameterizedconstructor pc= new parameterizedconstructor(5034,"akhiltoy");
          parameterizedconstructor pc1= new parameterizedconstructor(5035,"siddu");
          pc.disp();
          pc1.disp();   
      }
    
    
}
