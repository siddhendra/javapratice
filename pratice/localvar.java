public class localvar {
    public String myVar="instance variable";
    
   public void myMethod(){
    	String myVar = "Inside Method";
    	System.out.println(myVar);
   }
   public static void main(String args[]){

      localvar obj = new localvar();
    	
      System.out.println("Calling Method");
      obj.myMethod();
      System.out.println(obj.myVar);
   }
    
}
