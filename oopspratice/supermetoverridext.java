public class supermetoverridext extends supermetoverrid{
    public void disp()
    {
        System.out.println("child class method");
    }
    void printmsh()
    {
        disp();
        super.disp();
    }
    public static void main(String[] args) {
        supermetoverridext smo=new supermetoverridext();
        smo.printmsh();
    }
}
