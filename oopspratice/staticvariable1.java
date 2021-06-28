public class staticvariable1 {
    static int var1=77; 
   String var2;

   public static void main(String args[])
   {
	staticvariable1 ob1 = new staticvariable1();
	staticvariable1 ob2 = new staticvariable1();
	
	ob1.var1=88;
	ob1.var2="I'm Object1";
     ob2.var1=99;
	ob2.var2="I'm Object2";
	System.out.println("ob1 integer:"+ob1.var1);
	System.out.println("ob1 String:"+ob1.var2);
	System.out.println("ob2 integer:"+ob2.var1);
	System.out.println("ob2 STring:"+ob2.var2);
   }
    
}
