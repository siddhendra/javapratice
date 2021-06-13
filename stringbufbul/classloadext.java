public class classloadext {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c = Class.forName("stringbufbul.classload");
       classload cl = (classload)c.newInstance();
       classload.disp();
        
    }
    
}
