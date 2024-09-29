public class MathUtil {
//1.Checks whether a given number n is prime.
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;//Returns true if the number is prime, otherwise false.
    }
//2.Calculates the greatest common divisor (GCD) of two integers using the Euclidean algorithm.
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
//3.Computes the least common multiple (LCM) of two numbers.
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
//4.Returns the nth Fibonacci number(0,1,1,2)
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
             int temp = a + b;
             a = b;
             b = temp;
        }
        return b;
}
//5.Calculates the factorial of a number
    public static int factorial(int n) {
        if (n == 0) return 1;
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }




}

