import java.util.InputMismatchException;
import java.util.Scanner;

public class Task130 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt user for the first number
            System.out.print("Enter the first number: ");
            int firstNumber = scanner.nextInt();

            // Prompt user for the second number
            System.out.print("Enter the second number: ");
            int secondNumber = scanner.nextInt();

            // Attempt division
            int result = firstNumber / secondNumber;
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } 
        catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer.");
        } 
        catch (Exception e) {
            System.out.println("Error: An unexpected error occurred.");
        } 
        finally {
            scanner.close();
        }
    }
}

