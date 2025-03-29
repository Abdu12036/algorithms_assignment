import recursion.Recursion;

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

    // Function for checking whether the number is prime or not
    public static String checkPrime(int n) {
        // If number is less than 2 then it is not prime
        if(n<2)return "Composite";
        // if there is any divisor between two and number itself, then it is not prime
        for(int i = 2;i<n;i++){
            if(n%i==0)return "Composite";
        }
        // return "prime" if none of the conditions above were true
        return "Prime";
    }

    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        System.out.println(recursion.isAllDigits("1574a65"));
    }
}
