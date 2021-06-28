public class website {
        int webage;
        String name;
        
        website(String name, int age){
            this.name= name;
            this.webage = age;
         }
         public static void main(String args[]){
            website obj1 = new website("codegym", 5);
            website obj2 = new website("google", 18);
      
           //Accessing object data through reference
           System.out.println(obj1.name+" "+obj1.webage);
           System.out.println(obj2.name+" "+obj2.webage);
         }
    
    
}
