package java1;

public class exists {
    public static void main(String[] args) {
        int a[] = {10,50,80,90,70};
        int element=80;
        boolean flag=false;
        for(int i=0;i<a.length;i++)
        {
            if(a[i] == element)
            {
                flag=true;
                break;
            
            }
            if(flag)
            {
                System.out.println("element exits");

            }
        else{
            System.out.println("element doesn't exits");
        }
        }

    }
    
}
