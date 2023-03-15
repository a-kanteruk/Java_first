import java.util.ArrayList;
import java.util.Scanner;
public class Basket {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> basket = new ArrayList<String>();
        while (true){
            System.out.println("Enter 'exit' to quit");
            System.out.print("Please, enter new product: ");
            String word = in.nextLine();
            if (word.equals("exit")){
                break;
            }else{
                basket.add(word);
            }
        }
        System.out.println(basket);

    }
}
