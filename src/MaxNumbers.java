import java.util.Scanner;

public class MaxNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input first number: ");
        int a = input.nextInt();
        System.out.print("Input second number: ");
        int b = input.nextInt();

        if (a > b){
            System.out.println("Max number is " + a);
        } else if (a == b) {
            System.out.println("Numbers is equals");
        } else{
            System.out.println("Max number is " + b);
        }
    }
}
