import java.util.Scanner;
public class Max_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int a = in.nextInt();
        System.out.print("Input second number: ");
        int b = in.nextInt();
        if (a > b){
            System.out.println("Max number is " + a);
        }else{
            System.out.println("Max number is " + b);
        }
    }
}
