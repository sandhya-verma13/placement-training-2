public class LargestElementInArray {
    public static int findLargest(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty.");
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] numbers = {12, 45, 6, 89, 23, 7};
        int largest = findLargest(numbers);
        System.out.println("The largest element in the array is: " + largest);
    }
}
