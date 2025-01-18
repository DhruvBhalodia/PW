public class ArmstrongNumber {
    public static int power(int base, int exp) {
        if (exp == 0) return 1;
        return base * power(base, exp - 1);
    }

    public static int armstrongSum(int n, int digits) {
        if (n == 0) return 0;
        return power(n % 10, digits) + armstrongSum(n / 10, digits);
    }

    public static void main(String[] args) {
        int n = 153;
        int digits = String.valueOf(n).length();
        if (armstrongSum(n, digits) == n) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
