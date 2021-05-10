import java.util.Scanner;

class input {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("enter your first name :");
        String firstname = input.next();

        System.out.println("enter your last name :");
        String lastname = input.next();

        System.out.println("your full name is "+firstname+""+ lastname);

    }
    
}
