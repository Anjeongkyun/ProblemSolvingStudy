package lectureStudy.sort.quicksort;

import java.util.ArrayList;
import java.util.Arrays;

public class quicksort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<20; i++)
            list.add((int)(Math.random() * 100));

        System.out.println(sort(list));
    }

    private static ArrayList<Integer> sort(ArrayList<Integer> list) {
        if(list.size() <= 1){
            return list;
        }

        int pivot = list.get(0);
        ArrayList<Integer> leftArray = new ArrayList<Integer>();
        ArrayList<Integer> rightArray = new ArrayList<Integer>();
        for(int i = 1; i < list.size(); i++){
            if(list.get(i) > pivot){
                rightArray.add(list.get(i));
            }else {
                leftArray.add(list.get(i));
            }
        }

        ArrayList<Integer> mergedArray = new ArrayList<Integer>();
        mergedArray.addAll(sort(leftArray));
        mergedArray.addAll(Arrays.asList(pivot));
        mergedArray.addAll(sort(rightArray));

        return mergedArray;
    }
}
