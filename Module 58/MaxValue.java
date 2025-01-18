public class MaxValue {
    public static int findMax(int[] arr, int index) {
        if (index == 0) return arr[0];
        return Math.max(arr[index], findMax(arr, index - 1));
    }

    public static void main(String[] args) {
        int[] arr = {13, 1, -3, 22, 5};
        System.out.println("Max value: " + findMax(arr, arr.length - 1)); 
    }
}
