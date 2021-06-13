public class outer1 {
    public static void main(String[] args) {
        String s = new String("sunnel");
        String s2 = s.intern();
        System.out.println(s.equals(s2));

    }

    
}
