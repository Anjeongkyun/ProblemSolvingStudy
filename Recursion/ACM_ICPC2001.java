package Recursion;

public class ACM_ICPC2001 {
    //1, 2, 4, 7, 13, ...
    // f(n) = f(n-1) + f(n-2) + f(n-3) 패턴

    public static void main(String[] args) {

        System.out.println(recursion(4));
    }

    private static int recursion(int n){
        if(n == 1) {
            return 1;
        }else if(n == 2){
            return 2;
        }else if(n ==3) {
            return 4;
        }else{
            return recursion(n-3) + recursion(n-2) + recursion(n-1);
        }
    }
}
