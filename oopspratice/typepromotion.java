public class typepromotion {
    void disp(int a, double b){
        System.out.println("Method A");
       }
       void disp(int a, double b, double c){
        System.out.println("Method B");
       }
       public static void main(String[] args) {
           typepromotion tp=new typepromotion();
           tp.disp(10,10.5d,10.8);
       }
    
}
