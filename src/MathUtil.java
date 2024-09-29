public class MathUtil {
//Checks whether a given number n is prime.
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;//Returns true if the number is prime, otherwise false.
    }
//Calculates the greatest common divisor (GCD) of two integers using the Euclidean algorithm.
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a; //Returns: The GCD of a and b
    }

}

