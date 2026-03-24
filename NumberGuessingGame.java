import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int num = r.nextInt(100) + 1;
        int guess = 0;

        System.out.println("Guess number between 1 to 100");

        while (guess != num) {
            System.out.print("Enter: ");
            guess = sc.nextInt();

            if (guess > num) {
                System.out.println("High");
            } else if (guess < num) {
                System.out.println("Low");
            } else {
                System.out.println("Correct");
            }
        }
    }
}