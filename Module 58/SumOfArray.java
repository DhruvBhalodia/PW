public class SumOfArray {
    public static int sumArray(int[] arr, int index) {
        if (index == -1) return 0;
        return arr[index] + sumArray(arr, index - 1);
    }

    public static void main(String[] args) {
        int[] arr = {92, 23, 15, -20, 10};
        System.out.println("Sum of array: " + sumArray(arr, arr.length - 1));
    }
}