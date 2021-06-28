public class forloopbreakexp {
    public static void main(String[] args) {
        int var;
        for(var=100; var>=10; var--)
        {
            System.out.println("var: "+var);
        if(var==95)
        {
            break;
        }
        }
        System.out.println("out of for loop");
    }
    
}
