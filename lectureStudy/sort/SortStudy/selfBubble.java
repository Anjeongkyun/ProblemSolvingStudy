package lectureStudy.sort.SortStudy;

import java.util.ArrayList;
import java.util.Collections;

public class selfBubble {
    public static void main(String[] args) {

        ArrayList<Integer> testData = new ArrayList<Integer>();

        for(int i = 0; i< 50; i++){
            testData.add((int)(Math.random() * 100));
        }

        System.out.println(sort(testData));
    }

    public static ArrayList<Integer> sort(ArrayList<Integer> dataList) {

        boolean swap = false;
        for(int i =0; i <= dataList.size() -1; i ++){

            for(int j= 0; j< dataList.size() -1 -i; j++){
                if(dataList.get(j) > dataList.get(j+1)){
                    Collections.swap(dataList, j, j+1);
                    swap = true;
                }
            }

            if(swap == false)
                break;
        }

        return dataList;
    }
}
