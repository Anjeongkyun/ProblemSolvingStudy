package Recursion;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.println(recursive(9));
    }

    private static int recursive(int n){
        if(n <= 1){
            return n;
        }else{
            return recursive(n - 1) + recursive(n - 2);
        }
    }
}
