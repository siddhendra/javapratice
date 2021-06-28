public class CopyConstructor {
    String web;

    public CopyConstructor(String w) {
        web = w;
    }

    public CopyConstructor(CopyConstructor cc) {
     web =cc.web;

    }
    void disp()
    {
        System.out.println("website:" +web);
    }
   public static void main(String[] args) {
       CopyConstructor obj1= new CopyConstructor("codegym.com");
       CopyConstructor obj2= new CopyConstructor(obj1);
       obj1.disp();
       obj2.disp();
   }
    
    
}
