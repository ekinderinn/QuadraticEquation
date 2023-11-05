import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c;

        try {
            System.out.println("Enter the coefficients of the quadratic equation (ax^2 + bx + c):");
            System.out.print("a = ");
            a = input.nextDouble();
            System.out.print("b = ");
            b = input.nextDouble();
            System.out.print("c = ");
            c = input.nextDouble();

            QuadraticEquation equation = new QuadraticEquation(a, b, c);
            equation.findRoots();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid coefficient.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
