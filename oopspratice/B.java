public class B extends singleinheritance {
    public void methodB()
    {
      System.out.println("Child class method");
    }
    public static void main(String[] args) {
        B obj= new B();
        obj.method1();
        obj.methodB();
    }
    
}
