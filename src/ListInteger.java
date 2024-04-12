import java.util.List;

public class ListInteger {
    public static boolean containsOnlyOddNumbers(List<Integer> numbers) {
        for (int num : numbers) {
            if (num % 2 == 0) { // Check if the number is even
                return false; // If any even number is found, return false
            }
        }
        return true; // If no even number is found, return true
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 3, 5, 7, 9); // Example list of integers

        if (containsOnlyOddNumbers(numbers)) {
            System.out.println("The list contains only odd numbers.");
        } else {
            System.out.println("The list contains at least one even number.");
        }
    }
}
