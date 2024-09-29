public class Main {
    public static void main(String[] args) {
//test isPrime()
        System.out.println("is 67 prime? " + MathUtil.isPrime(67)); //true
        System.out.println("is 16 prime? " + MathUtil.isPrime(16)); //false
//test gcd()
        System.out.println("what is the gcd of 45 and 30? " + MathUtil.gcd(45,30));
//test lcm()
        System.out.println("what is the lcm of 24 and 36? " + MathUtil.lcm(24,36));
        System.out.println("what is the lcm of 18 and 24? " + MathUtil.lcm(18,24));
        System.out.println("what is the lcm of 54 and 72? " + MathUtil.lcm(54,72));


//taest fibonnaci()
        System.out.println("5th Fibonacci number: " + MathUtil.fibonacci(5));
        System.out.println("10th Fibonacci number: " + MathUtil.fibonacci(10));
        System.out.println("15th Fibonacci number: " + MathUtil.fibonacci(15));


// Test factorial()
        System.out.println("Factorial of 5: " + MathUtil.factorial(5));
        System.out.println("Factorial of 10: " + MathUtil.factorial(10));
        System.out.println("Factorial of 25: " + MathUtil.factorial(25));
//test isPerfectNumber()
        MathUtil PerfectNumber = new MathUtil();
        System.out.println("Is 28 a perfect number? " + PerfectNumber.isPerfectNumber(28)); // true
        System.out.println("Is 496 a perfect number? " + PerfectNumber.isPerfectNumber(496)); // true
        System.out.println("Is 12 a perfect number? " + PerfectNumber.isPerfectNumber(12)); // false
//test sumOfDigits()
        MathUtil SumOfDigits = new MathUtil();
        System.out.println("Sum of digits of 12345: " + SumOfDigits.sumOfDigits(12345));
        System.out.println("Sum of digits of 99999: " + SumOfDigits.sumOfDigits(99999));
        System.out.println("Sum of digits of 12345: " + SumOfDigits.sumOfDigits(100));


    }


}