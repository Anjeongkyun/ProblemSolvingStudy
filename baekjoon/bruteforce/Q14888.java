package baekjoon.bruteforce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q14888 {

    static int N, max, min;
    static int[] nums, operators;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        input();
        recFunc(1, nums[1]);
        sb.append(max).append('\n').append(min);
        System.out.println(sb.toString());

    }

    private static void input(){

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        nums = new int[N + 1];
        operators = new int[5];
        for (int i = 1; i <= N; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = 1; i <= 4; i++) {
            operators[i] = sc.nextInt();
        }

        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
    }

    private static int calculator(int operand1, int operator, int operand2){
        if(operator == 1){
            return operand1 + operand2;
        }else if(operator == 2) {
            return operand1 - operand2;
        }else if(operator == 3) {
            return operand1 * operand2;
        }else {
            return operand1 / operand2;
        }

    }

    private static void recFunc(int k, int value){

        if(k == N){
            max = Math.max(max, value);
            min = Math.min(min, value);
        }else{
            for(int cand = 1; cand <= 4; cand ++){
                if(operators[cand] >= 1){
                    operators[cand] --;
                    recFunc(k + 1, calculator(value, cand, nums[k + 1]));
                    operators[cand]++;
                }
            }
        }
    }
}
