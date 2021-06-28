public class whileloopbreak {
    public static void main(String[] args) {
        int num=0;
        while(num<=100)
        {
            System.out.println("value of variable is : "+num);
        if(num==5)
        {
            break;
        }
        num++;
        }
        System.out.println("out of loop");
    }
    
}
