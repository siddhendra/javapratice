public class abstractanimlaext extends abstractanimal {
    public void sound()
    {
        System.out.println("woof");
    }
    public static void main(String[] args) {
        abstractanimal a=new abstractanimlaext();
        a.sound();
    }
    
}
