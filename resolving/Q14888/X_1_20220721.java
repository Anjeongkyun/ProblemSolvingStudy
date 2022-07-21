package resolving.Q14888;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class X_1_20220721 {

    static List<Integer> inputList = new ArrayList<>();
    static List<Integer> opList = new ArrayList<>();
    static List<Integer> resultList = new ArrayList<>();

    public static void main(String[] args) {
        input();
        solve();
    }

    private static void input(){

        int cnt = 0;

        Scanner sc = new Scanner(System.in);
        cnt = sc.nextInt();

        for (int i = 0; i < cnt; i++) {
            inputList.add(sc.nextInt());
        }

        System.out.println(inputList);
        for(int i =0; i< 4; i++){
            opList.add(sc.nextInt());
        }

        System.out.println(opList);

    }

    private static void solve(){


    }

    private static void opSetting(){

    }
}
