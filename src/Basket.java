import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Basket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> basket = new ArrayList<>();

        while (true){
            System.out.println("Enter 'q' to quit");
            System.out.print("Please, enter new product: ");
            String word = input.nextLine();
            if (word.equals("q")){
                break;
            }else{
                basket.add(word);
            }
        }
        System.out.println(basket);

    }
}
