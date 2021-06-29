public class JavaExample extends inheritancedemo {
    String mainSubject = "Chemistry";
    public static void main(String args[]){
     JavaExample obj = new JavaExample();
     System.out.println(obj.getCollegeName());
     System.out.println(obj.getDesignation());
     System.out.println(obj.mainSubject);
     obj.does();
    }
}
