import java.util.Random;
import java.util.Scanner;

public class fizzBuzz {
    public static void main(String[] args) {
        Random random = new Random();
        int attempts = 10;
        int randomValue = random.nextInt(100);

        Scanner scanner =  new Scanner(System.in);
        System.out.println("Find the secret number! you have 10 attempts ");

        for (int i = 0; i <= attempts; i++) {
            System.out.println("Type your option: ");
            int yourOpt = scanner.nextInt();

            if (yourOpt > randomValue) {
                System.out.println("Your option is GREATER than the secret number!");
            }else if(yourOpt < randomValue){
                System.out.println("Your option is SMALLER than the secret number!");
            }else{
                System.out.println("You have found the SECRET NUMBER!!!");
                System.out.println("Attempts used: " + i);
                break;
            }
        }

        if (attempts > 10) {
            System.out.println("You not found the number in 10 attempts!");
        }

        scanner.close();

    }
}
