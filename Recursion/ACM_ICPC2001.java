package Recursion;

import java.util.Scanner;

public class ACM_ICPC2001 {
    //1, 2, 4, 7, 13, ...
    // f(n) = f(n-1) + f(n-2) + f(n-3) 패턴

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 0; i< num; i ++){
            int N = sc.nextInt();
            System.out.println(recursion(N));
        }
    }

    private static int recursion(int n){
        if(n == 1) {
            return 1;
        }else if(n == 2){
            return 2;
        }else if(n ==3) {
            return 4;
        }else if (n <= 0 ){
            return 0;
        }else{
            return recursion(n-3) + recursion(n-2) + recursion(n-1);
        }
    }
}
