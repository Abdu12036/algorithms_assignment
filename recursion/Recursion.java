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

    // function for finding the n-th term of fibonacci sequence
    // it uses a recursive approach
    public int fibonacci(int n) {
        // the first term is 0 and second term is 1
        if(n==1)return 0;
        else if(n==2)return 1;
        // sums up the previous two terms of the sequence
        else return fibonacci(n-1) + fibonacci(n-2);
    }

}
