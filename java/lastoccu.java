package java1;

public class lastoccu {
    public static void main(String[] args) {
        String s= new String("CIVIC");
        char[] ch =s.toCharArray();
        char c='C';
        int temp=0;
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]==c)
            {
                temp=i;

            }
            

        }
        System.out.println(temp);

    }
    
}
