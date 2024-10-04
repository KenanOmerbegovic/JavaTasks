import java.util.Scanner;
public class BasicCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int firstInteger = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int secondInteger = scanner.nextInt();
        int sum = firstInteger + secondInteger;
        System.out.println("The sum of " + firstInteger + " and " + secondInteger + " is " + sum + ".");
    }
}