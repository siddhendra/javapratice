public class subclass extends superkey {
    int num=10161;
    void printnumber()
    {
        System.out.println(super.num);
    }
    public static void main(String[] args) {
        subclass sc= new subclass();
        sc.printnumber();
    }
}
