public class absclassmethodext extends absclassmethod {
    public void disp2()
   {
       System.out.println("overriding abstract method");
   }
   public static void main(String args[]){
    absclassmethodext obj = new absclassmethodext();
       obj.disp2();
   }
    
}
