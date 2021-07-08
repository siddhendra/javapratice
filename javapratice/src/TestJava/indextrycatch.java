package TestJava;

public class indextrycatch {
    public static void main(String[] args) {
        int[] a={10,50,90};
        try
        {
            System.out.println(a[5]);

        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("pass correct index");
        }
    }
    
}
