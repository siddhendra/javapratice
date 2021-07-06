public class emploooext {
    public static void main(String[] args) {
        emplooo e1= new emplooo(100,"A");
        emplooo e2= new emplooo(100, "A");
        boolean flag = e1.equals(e2);
        if(flag)
        {
            System.out.println("2 objects are equal");
        }
        else
        {
            System.out.println("2 objects are not equal");
        }

    }
    
}
