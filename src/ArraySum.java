public class ArraySum {
    public static int arraySum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; // Example array of integers

        int sum = arraySum(numbers);
        System.out.println("Sum of array elements: " + sum);
    }
}
