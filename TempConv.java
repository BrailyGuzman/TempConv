import java.util.Scanner;

public class TempConv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Temperature: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter Temperature Unit (F or C): ");
        String tempUnit = scanner.next().toUpperCase();
        scanner.close();

        if (tempUnit.equals("F")) {
            temperature -= 32;
            temperature /= 1.8;
            System.out.println("Celsius: " + temperature);
        }
        else if (tempUnit.equals("C")) {
            temperature *= 1.8;
            temperature += 32;
            System.out.println("Fahrenheit: " + temperature);
        }
    }
}
