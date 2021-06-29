public class staticbindingext extends staticbinding {
    public static void walk(){
        System.out.println("Boy walks");
    }
    public static void main( String args[]) {
        staticbinding obj = new staticbindingext();
        staticbinding obj2 = new staticbinding();
        obj.walk();
        obj2.walk();
    }
    
}
