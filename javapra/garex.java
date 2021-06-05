public class garex {
    public static void main(String[] args) {
        garbage garb = new garbage();  
        garb.disp();
        garb.show();
        garb=null;
        System.gc();
    }
    
}
