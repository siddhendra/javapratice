public class xyz extends ABC{
public void myMethod(){
	System.out.println("Overriding Method");
   }
   public static void main(String args[]){
	ABC obj = new xyz();
	obj.myMethod();
   } 
    
}
