import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        if (firstNumber > secondNumber) {
            System.out.println("The greater number is: " + firstNumber);
        } else if (secondNumber > firstNumber) {
            System.out.println("The greater number is: " + secondNumber);
        } else {
            System.out.println("Both numbers are equal: " + firstNumber);
        }

    }
}