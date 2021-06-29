public class superconsext extends supercons {
    superconsext()
    {
        super("hahaha");
        System.out.println("constructor of child class");
    }
    void display(){
        System.out.println("Hello");
       }
       public static void main(String args[]){		
        superconsext obj= new superconsext();
        obj.display();	 
       }
    
}
