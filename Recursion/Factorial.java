package Recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorialFunc(3));

    }

    public static int factorialFunc(int n){
        if(n > 1)
            return n * factorialFunc(n - 1);
        else
            return 1;

    }
}
