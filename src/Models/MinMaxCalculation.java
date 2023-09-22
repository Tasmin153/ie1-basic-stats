import java.util.Arrays;

public class MinMaxCalculation {
    public static void main(String[] args) {
        // Given set of numbers
        int[] numbers = {34, 7, 23, 32, 5, 62};

        // Initial values assumed to be first element for min and max
        int min = numbers[0];
        int max = numbers[0];

        // Loop through the array to find minimum and maximum
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Output the results
        System.out.println("Given numbers: " + Arrays.toString(numbers));
        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
    }
}
