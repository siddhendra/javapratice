public class methodoverrodden1ext extends methodoverrodden1{
    public void disp()
    {
        System.out.println("child class method");

    }
    public static void main(String[] args) {
        methodoverrodden1 mor=new methodoverrodden1();
        mor.disp();
        methodoverrodden1 mor1=new methodoverrodden1ext();
        mor1.disp();
    }
    
}
