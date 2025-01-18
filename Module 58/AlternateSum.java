public class AlternateSum {
    public static int alternateSum(int n) {
        if (n == 0) return 0;
        return (n % 2 == 0 ? -n : n) + alternateSum(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Alternate sum: " + alternateSum(n)); 
    }
}