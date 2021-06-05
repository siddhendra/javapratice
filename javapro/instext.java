public class instext {
    public static void main(String[] args) {
        instance in = new instance(20, "siddu");
        System.out.println(in instanceof instance);
        if(in instanceof instance)
        {
            in.disp();
        }

    }
    
}
