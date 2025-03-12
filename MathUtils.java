public class MathUtils {

    // Function to calculate the greatest common divisor (GCD) using Euclidean algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate the factorial of a number using recursion
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        return (n == 0 || n == 1) ? 1 : n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("GCD of 36 and 60: " + gcd(36, 60));
        System.out.println("Factorial of 5: " + factorial(5));
    }
}
