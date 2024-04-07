package JavaExercise.Challenges.TwoSumChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class twoSumArray {
    public static void main(String[] args) {
        int target = 9;
        int sum;

        List<Integer> intArray =  new ArrayList<>(Arrays.asList(2, 11, 15, 7));

        Random random = new Random();

        do {
            int num1 = intArray.get(random.nextInt(4));
            int num2 = intArray.get(random.nextInt(4));

            sum = num1 + num2;      
            
            int num1Index = intArray.indexOf(num1);
            int num2Index = intArray.indexOf(num2);

            if (sum == target) {
                System.out.println("Adding the index " + (num1Index + 1) + " with the index " + (num2Index + 1) + " in this array. We have result: " + sum);
            }
        } while (sum != target);

    }
}
