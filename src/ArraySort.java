import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 3, 1, 9, 4, 6, 7}; // Example array of integers

        System.out.println("Original array:");
        System.out.println(Arrays.toString(numbers));

        // Sort the array in ascending order
        Arrays.sort(numbers);

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(numbers));
    }
}
