public class Main {
    // function to find the minimum number from the array
    public static int findMinimum(int[] arr, int n) {
        // set the first member as a minimum
        int min = arr[0];
        // iterating through the array to find the smallest number
        for (int i = 1; i < n; i++) {
            // if number is smaller than our current min, update the min
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        // returning our minimum number to main
        return min;
    }

    // function to find the average of numbers in array
    public static double findAverage(int[] arr, int n) {
        double sum = 0;
        // summing all the numbers in array
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        // dividing the sum into n and returning the average
        return (sum / n);
    }

    public static void main(String[] args) {
        int[] arr = {2,4,8,-4,4};
        System.out.println(findAverage(arr, 5));
    }
}
