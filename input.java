import java.util.Scanner;

class input {
    public static void main(String[] args){
        Scanner scrobj = new Scanner(System.in);

        System.out.println("enter your first name :");
        String firstname = scrobj.next();

        System.out.println("enter your last name :");
        String lastname = scrobj.next();

        System.out.println("your full name is "+firstname+""+ lastname);

    }
    
}
