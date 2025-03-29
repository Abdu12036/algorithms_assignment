package recursion;

public class Recursion {
    // function for finding the factorial of the number
    // it uses a recursive approach
    public int factorial(int n) {
        // if number equals to 0 or 1, then return 1
        if(n==0 || n==1)return 1;
        // calling function itself with parameter n-1
        // untill n becomes 1
        else return n*factorial(n-1);
    }
}
