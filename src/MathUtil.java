public class MathUtil {
//Checks whether a given number n is prime.
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;//Returns true if the number is prime, otherwise false.
    }

}

