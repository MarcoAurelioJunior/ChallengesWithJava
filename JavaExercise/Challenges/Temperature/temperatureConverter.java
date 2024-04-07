package JavaExercise.Challenges.Temperature;

import java.util.Scanner;

public class temperatureConverter {
    public static void main(String[] args) {
        ConvertTemperature();
    }
    
    public static void ConvertTemperature(){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Type a temperature (graus celsius): \n");
            System.out.println("Or type 0(zero) to close system");
                double temperatureCelsius = scanner.nextDouble();
            if(temperatureCelsius == 0) {
                break;
            }
            System.out.println("----------------- Which format do you want to convert -----------------");
            System.out.print("0 - Close System \n1 - Kelvin (k) \n2 - Réaumur (Re) \n3 - Rankine \n4 - Fahrenheit (F)\n");
            System.out.print("Type your option: ");
                int opt = scanner.nextInt();

            if(opt == 0){
                break;
            }
            
            if (opt == 1) {
                double kelvin = temperatureCelsius + 273.15;
                System.out.println("Converting Celsius to Kelvin. We have: " + kelvin);
                System.out.println("-------------------------------------------------");
            }else if(opt == 2){
                double reaumur = temperatureCelsius * 0.8;
                System.out.println("Converting Celsius to Réaumur. We have: " + reaumur);
                System.out.println("-------------------------------------------------");
            }else if(opt == 3){
                double rankine = temperatureCelsius * 1.8 + 32 + 459.67;
                System.out.println("Converting Celsius to Rankine. We have: " + rankine);
                System.out.println("-------------------------------------------------");
            }else if(opt == 4){
                double Fahrenheit = temperatureCelsius * 1.8 + 32;
                System.out.println("Converting Celsius to Fahrenheit. We have: " + Fahrenheit);
                System.out.println("-------------------------------------------------");
            }
        }
    }
}
