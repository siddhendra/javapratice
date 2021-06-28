public class whileloopexp {
    public static void main(String[] args) {
        int count=10;
        while(count>=0)
        {
            if(count==5)
            {
                count--;
                continue;
            }
            System.out.println(count+" ");
            count--;
        }
    }
    
}
