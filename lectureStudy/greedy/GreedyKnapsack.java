package lectureStudy.greedy;

import java.util.Arrays;
import java.util.Comparator;

public class GreedyKnapsack {

    //무게 제한이 k인 배낭에 최대 가치를 가지도록 물건을 넣는문제
    public static void main(String[] args) {
        int[][] objectList = { {10,10}, {15,12},{20,10},{25,8},{30,5}};
        knapsackFunc(objectList, 30.0);
    }

    private static void knapsackFunc(int[][] objectList, double capacity){

        double totalValue = 0.0;
        double fraction = 0.0;

        //objectList Sort
        Arrays.sort(objectList, new Comparator<int[]>() {
            @Override
            public int compare(int[] obj1, int[] obj2) {
                return ((obj2[1] / obj2[0]) - (obj1[1] / obj1[0]));
            }
        });

        for(int i = 0; i<objectList.length; i++){
            //if(배낭 무게 - 리스트 무게 > 0)
            if(capacity - (double) objectList[i][0] > 0){
                capacity -= (double) objectList[i][0];
                //리스트 가치 더하기
                totalValue += (double) objectList[i][1];

                System.out.println("무게:" + objectList[i][0] + ", 가치:" + objectList[i][1]);
            }else{// 쪼개서 배낭에 넣기
                fraction = capacity / (double) objectList[i][0];
                totalValue += (double) objectList[i][1] * fraction;
                System.out.println("무게:" + objectList[i][0] + ",가치:" + objectList[i][1] + ", 비율:" + fraction);
                break;
            }
        }
        System.out.println("총 담을 수 있는 가치 : " + totalValue);
    }
}
