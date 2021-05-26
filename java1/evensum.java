package java1;

public class evensum {
    public static void main(String[] args) {
        int a[] ={10,20,30,50,80,70};
        int evensum=0;
        for(int t:a)
        {
           if(t%2==0)
           {
               evensum=evensum + t;
              
           }
          
        }
        System.out.println(evensum);    
    }
    
}
