public class JavaPrimes {
    public static boolean isPrime(int n) {
        final int upper = (int)Math.sqrt(n);
        for (int i = 2; i <= upper; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}