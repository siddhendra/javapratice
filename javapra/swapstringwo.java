public class swapstringwo {
    public static void main(String[] args) {
        String s = "siddu";
        String s1 = "Madala";
        s = s + s1;
        s1=s.substring(0,(s.length()-s1.length()));
        s = s.substring(s1.length());

        System.out.println("s =" +s);
        System.out.println("s1 =" +s1);
    }
    
}
