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
             int temp = a + b; //adding b to the previous number
             a = b;//a becomes b
             b = temp;
        }
        return b;//returning sum of last 2 numbers
}
//5.Calculates the factorial of a number
    public static int factorial(int n) {
        if (n == 0) return 1;
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i; //multiplying each number from 1 to n
        }
        return result;
}
//6.Determines if the given number n is a perfect number (a number equal to the sum of its divisors, excluding itself).
    public boolean isPerfectNumber(int n) {
        if (n <= 1) return false;
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) sum += i; //we found devisors of n and added to sum
        }
        return sum == n;
    }


}

