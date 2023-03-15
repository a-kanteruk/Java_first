import java.util.Scanner;
public class Password {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please, create password: ");
        String password = in.nextLine();
        while(true){
            System.out.print("Please, input password: ");
            String input = in.nextLine();
            if (input.equals(password)){
                System.out.println("Welcome!");
                break;
            } else if (input.equals("quit")) {
                break;
            } else{
                System.out.println("Password incorrect!");
                System.out.println("If you wanna quit, input 'quit'.");
            }
        }
    }
}
