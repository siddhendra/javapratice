public class inner {
    private int eno=100;
    private static String ename ="siddu";
   static class Inner
		{
			public static void disp()
			{
				System.out.println(ename);
			}
		}
		
		public void show()
		{
			Inner.disp();
		}
}

    

