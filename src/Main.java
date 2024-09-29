public class Main {
    public static void main(String[] args) {
//test isPrime()
        System.out.println("is 67 prime? " + MathUtil.isPrime(67)); //true
        System.out.println("is 16 prime? " + MathUtil.isPrime(16)); //false
//test gcd()
        System.out.println("what is the gcd of 45 and 30? " + MathUtil.gcd(45,30));
//test lcm()
        System.out.println("what is the lcm of 24 and 36? " + MathUtil.lcm(24,36));
    }
}