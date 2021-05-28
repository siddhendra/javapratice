package java1;

public class reversestring 
{
public static void main(String[] args) {
    String s= new String("siddu");
    char[] ch = s.toCharArray();
    String rev="";
    for(int i=ch.length-1;i>=0;i--)
    {
        rev=rev+ch[i];

    }
    System.out.println(rev);
    
}    
}
