public class localdrive {
    public static void main(String[] args) {
        local l = new local(){
            public int sum(int n1,int n2)
            {
                return n1+n2;
            }
        };
        int result = l.sum(10,80);
        System.out.println(result);
    }
    
}
