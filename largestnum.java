public class largestnum {
    
    public static void main(String[] args) {
        int num1 = 20, num2 = 40 , num3 = 90;
        if(num1 >= num2 && num1 >= num3){
            System.out.println(num1+ "num1 is largest number");
         } else if (num2 >= num1 && num2 >= num3)
            System.out.println(num2+" is the largest Number");
         
         
        else
            System.out.println(num3+" is the largest Number");
         
    }
  
    
}
