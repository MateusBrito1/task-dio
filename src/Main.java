import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Your FullName: ");
        String fullName = scan.nextLine();

        System.out.println("Username: ");
        String user = scan.nextLine();

        System.out.println("Your email: ");
        String email = scan.nextLine();

        System.out.println("Your birthday: ");
        String birthday = scan.nextLine();

        System.out.println("Your Password: ");
        String password = scan.nextLine();


        System.out.println("Account successfully created, " + fullName + "! ");
        System.out.println("Check your details below ");
        System.out.println("Your user: " + user);
        System.out.println("Email: " + email);
        System.out.println("Birthday: " + birthday);
        System.out.println("Your password: " + password);
        System.out.println("If your details are correct, you can proceed. Press Enter!");
        scan.nextLine();
        System.out.println("Account created successfully, Welcome!");


        scan.close();


    }
}