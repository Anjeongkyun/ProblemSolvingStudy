package SortStudy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SelectionSort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++)
            list.add((int) (Math.random() * 100));

        System.out.println(selectionSort(list));
    }

    public static ArrayList<Integer> selectionSort(ArrayList<Integer> list){

        int lowest;

        for (int stand = 0; stand < list.size() - 1; stand++){
            lowest = stand;

            for(int index= stand + 1; index < list.size(); index ++){
                if(list.get(lowest) > list.get(index)){
                    lowest = index;
                }
            }
            Collections.swap(list, lowest, stand);
        }


        return list;
    }
}
