package resolving.greedy;

import java.util.ArrayList;
import java.util.Arrays;

public class GreedyCoin {

    public static void main(String[] args) {

        ArrayList<Integer> coinList = new ArrayList<Integer>(Arrays.asList(500,100,50,10));
        ArrayList<Integer> details = new ArrayList<Integer>();

        int price = 4720;
        int totalCoinCount = 0;
        int coinNum = 0;


        for(int i=0; i< coinList.size(); i ++){
            coinNum = price / coinList.get(i); // 몫 = 동전 개수
            totalCoinCount += coinNum; // 토탈 동전 개수
            price -= coinNum * coinList.get(i); // 몫 * 금액하여 나머지 대입
            details.add(coinNum);

            System.out.println(coinList.get(i) + "원: " + coinNum + "개");
        }

        System.out.println("총 동전 갯수:" + totalCoinCount);

    }
}
