public class horse1 extends animal1 {
    public void sound()
    {
        System.out.println("neigh");
    }
public static void main(String[] args) {
    animal1 a1= new horse1  ();
    a1.sound();
}    
}
