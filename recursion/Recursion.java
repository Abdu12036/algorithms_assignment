package recursion;

import java.util.Scanner;

public class Recursion {

    Scanner sc = new Scanner(System.in);

    // function for finding the factorial of the number
    // it uses a recursive approach
    // Time complexity: O(n)
    public int factorial(int n) {
        // if number equals to 0 or 1, then return 1
        if(n==0 || n==1)return 1;
        // calling function itself with parameter n-1
        // untill n becomes 1
        else return n*factorial(n-1);
    }

    // function for finding the n-th term of fibonacci sequence
    // it uses a recursive approach
    // Time complexity: O(2^n)
    public int fibonacci(int n) {
        // the zero term is 0 and first term is 1
        if(n==0)return 0;
        else if(n==1)return 1;
        // sums up the previous two terms of the sequence
        else return fibonacci(n-1) + fibonacci(n-2);
    }

    // function for raising a to the n-th power
    // it uses a recursive approach
    // Time complexity: O(n)
    public int toPower(int a, int n){
        // if base is 1 or power is 0 then it must return 1
        if(a==1 || n==0)return 1;
        // using recursion to call function n times
        else return a*toPower(a,n-1);
    }

    // function for printing sequence of numbers in reverse order
    // it uses recursive approach
    // Time complexity: O(n)
    public void printNumbers(int n) {
        // base case
        if (n == 0) return;
        // input values
        int a = sc.nextInt();
        // calling the function itself until n is 0
        printNumbers(n - 1);
        // the printing will be executed only after function call is finished
        System.out.print(a + " ");
    }

    // function for checking whether s is all consists of numbers
    // it uses recursive approach
    // Time complexity: O(n)
    public boolean isAllDigits(String s) {
        // base case
        // if string becomes empty then return true
        if (s.length() == 0) {
            return true;
        }
        // Check first character
        char firstChar = s.charAt(0);
        if (!Character.isDigit(firstChar)) {
            // If first character isn't a digit, return false
            return false;
        }
        // Recursive call excluding the first character of string
        return isAllDigits(s.substring(1));
    }

    // function for finding binomial coefficient
    // it uses recursive approach
    // Time complexity: O(2^n)
    public int calculateBinomial(int n, int k) {
        // Base cases
        if (k == 0 || k == n) {
            return 1;
        }
        // invalid cases
        if (k < 0 || k > n) {
            return 0;
        }
        // Recursive call using formula: C(n, k) = C(n-1, k) + C(n-1, k-1)
        return calculateBinomial(n - 1, k) + calculateBinomial(n - 1, k - 1);
    }

    // function for finding GCD of 2 numbers
    // it uses recursive approach
    // Time complexity: O(log(min(a,b)))
    public int findGCD(int a, int b) {
        // Base case
        // if b is 0, return a
        if (b == 0) {
            return a;
        }
        // Recursive case: GCD(a, b) = GCD(b, a % b)
        return findGCD(b, a % b);
    }
}

