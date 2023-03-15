import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, create password: ");
        String password = input.nextLine();

        while(true){
            System.out.print("Please, input password: ");
            String user_password = input.nextLine();
            if (user_password.equals(password)){
                System.out.println("Welcome!");
                break;
            } else if (user_password.equals("q")) {
                break;
            } else{
                System.out.println("Password incorrect!");
                System.out.println("If you wanna quit, input 'q'.");
            }
        }
    }
}
