package java1;

public class palindrome1 {
    public static void main(String[] args) 
        {
        String s = new String("civic");
        char[] ch = s.toCharArray();
        String rev="";
        for(int i=ch.length-1;i>=0;i--)
        {
            rev=rev+ch[i];
        }
        if(s.equals(rev))
        {
          System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }

	}
    
}
