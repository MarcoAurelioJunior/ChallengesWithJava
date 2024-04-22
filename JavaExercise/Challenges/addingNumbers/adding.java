package JavaExercise.Challenges.addingNumbers;

import java.util.Scanner;

public class adding {
    public static void main(String[] args) {
        int num = 1;
        int Odd_Pair = 0;

        int pair = 0;
        int odd = 0;
        Scanner scanner = new Scanner(System.in);


        while (num != 0) {
            System.out.println("If you can stop the system, type 0");
            System.out.println("Type a number: ");
            num = scanner.nextInt();

            Odd_Pair = num % 2;
            if (Odd_Pair == 0 ) {
                pair += num;
            }
            else{
                odd += num;
            }
        }

        System.out.println("\nAdding all pairs numbers, we have: " + pair + "\n");
        System.out.println("Adding all odd numbers, we have: " + odd);

        scanner.close();
        
    }
}
