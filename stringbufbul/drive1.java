public class drive1 {
    public static void main(String[] args)throws ClassNotFoundException, InstantiationException, IllegalAccessException 
 {
        Class c = Class.forName("stringbufbul.emp1");
        empl e = (empl)c.newInstance();
        empl.disp();

    }
    
}
