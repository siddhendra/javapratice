public class staticclass {
    private static String str = "CodeGym";
   static class MyNestedClass{
	public void disp() {
	   System.out.println(str); 
	}

   }
   public static void main(String args[])
   {

	staticclass.MyNestedClass obj = new staticclass.MyNestedClass();
	obj.disp();
   }
    
}
