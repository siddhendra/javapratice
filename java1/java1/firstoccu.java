package java1;

public class firstoccu {
    public static void main(String[] args) {
        String s = new String("MADAM");
        char[] ch =s.toCharArray();
        char c='M';
        int temp = 0;
        for(int i=0;i<ch.length;i++)
{
    if(ch[i]==c)
    {
        System.out.println(i);
        break;

    }
}
    }
    
}
