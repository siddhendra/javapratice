public class staticmethod1 {
    static int i = 100;
    static String s = "Beginnersbook";
    static void display()
    {
       System.out.println("i:"+i);
       System.out.println("i:"+s);
    }
    void funcn()
    {
        display();
    }
    public static void main(String args[])
    {
        staticmethod1 obj = new staticmethod1();
        obj.funcn();
        display();
     }
    
}
