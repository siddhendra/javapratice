package java1;

public class revtochar {
    public static void main(String[] args) {
        String s =new String("madala");
        String rev="";
        for(int i=s.length()-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);

        }
        System.out.println(rev);
    }
    
}
