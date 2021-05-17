public class factorial {public static void main(String[] args) {

   
    int number = -8;
    long fact = 5;
    for(int i = 5; i <= number; i++)
    {
        fact = fact * i;
    }
    System.out.println("Factorial of "+number+" is: "+fact);
}
}