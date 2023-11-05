public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void findRoots() {
        if (a == 0) {
            throw new ArithmeticException("Coefficient a must not be zero.");
        }

        double delta = b * b - 4 * a * c;

        if (Double.isInfinite(delta) || Double.isNaN(delta)) {
            throw new ArithmeticException("The value of delta is too large or too small to be represented as a double.");
        }

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("The roots of the quadratic equation are: " + root1 + " and " + root2);
        } else if (delta == 0) {
            double root = -b / (2 * a);
            System.out.println("The root of the quadratic equation is: " + root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-delta) / (2 * a);
            System.out.println("The roots of the quadratic equation are: " + realPart + " + " + imaginaryPart + "i and " + realPart + " - " + imaginaryPart + "i");
        }
    }
}
