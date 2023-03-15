import java.util.Scanner;

public class SimpleNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input first number: ");
        int a = input.nextInt();
        System.out.print("Input second number: ");
        int b = input.nextInt();

        boolean flag;
        for (int i = a; i <= b; i++){
            flag = true;
            for(int j = 2; j < i; j++) {
                if ((i % j) == 0) {
                    flag = false;
                    break;
                }
            }
            if ((flag == true)&&(i != 1)){
                System.out.println(i);
            }
            }
        }
    }

