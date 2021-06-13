public class outer {
    private int n1=40;
    private int n2=20;    
       public void disp() {
         class inner{
     public void sum()
     {
         System.out.println(n1+n2);
     }
         }
   
       new inner().sum();
   }

}