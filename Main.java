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
    public static void main(String[] args) {
        int[] arr = {1,7,5,-4,4};
        System.out.println(findMinimum(arr, 5));
    }
}
