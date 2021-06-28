public class InstanceVarExampl {
    String myInstanceVar="instance variable";
	
   public static void main(String args[]){
	InstanceVarExampl obj = new InstanceVarExampl();
	InstanceVarExampl obj2 = new InstanceVarExampl();
	InstanceVarExampl obj3 = new InstanceVarExampl();
		
	System.out.println(obj.myInstanceVar);
	System.out.println(obj2.myInstanceVar);
	System.out.println(obj3.myInstanceVar);

		
	obj2.myInstanceVar = "Changed Text";

		
	System.out.println(obj.myInstanceVar);
	System.out.println(obj2.myInstanceVar);
	System.out.println(obj3.myInstanceVar);
   }
}
    

