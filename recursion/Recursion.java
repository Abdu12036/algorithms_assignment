package recursion;

import java.util.Scanner;

public class Recursion {

    Scanner sc = new Scanner(System.in);

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
        // the zero term is 0 and first term is 1
        if(n==0)return 0;
        else if(n==1)return 1;
        // sums up the previous two terms of the sequence
        else return fibonacci(n-1) + fibonacci(n-2);
    }

    // function for raising a to the n-th power
    // it uses a recursive approach
    public int toPower(int a, int n){
        // if base is 1 or power is 0 then it must return 1
        if(a==1 || n==0)return 1;
        // using recursion to call function n times
        else return a*toPower(a,n-1);
    }

    // function for printing sequence of numbers in reverse order
    // it uses recursive approach
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



}
