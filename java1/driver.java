package java1;

public class driver {
    public static void main(String[] args) {
        String s =new String("siddu");
        char[] ch=s.toCharArray();
        String temp="";
        int l=1;
        char c='d';
        for(int i=0;i<s.length();i++)
        {
            if(ch[i]==c)
            {
                temp=temp+l++;

            }
            else
            {
                temp=temp+ch[i];

            }
            

        }
        System.out.println(temp);

    }
    
}
