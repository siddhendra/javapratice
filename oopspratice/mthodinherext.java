public class mthodinherext extends mthodinher {
    mthodinherext(){
        super.disp();
System.out.println("constructor of child class");        
    }
    void disp(){
        System.out.println("child method");
    }
    public static void main(String[] args) {
        mthodinherext mi= new mthodinherext();
        mi.disp();
    }
}
