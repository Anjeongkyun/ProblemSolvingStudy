package programmers.stackqueue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.stream.IntStream;

public class donlikesamenumber {
    public static void main(String[] args) {
        int[] arr1 = {1,1,3,3,0,1,1};
        int[] arr2 = {4, 4, 4, 3, 3};

        var a = solution(arr1);
        var b = solution(arr2);
        System.out.println(solution(arr1));
        System.out.println(solution(arr2));
    }

    public static int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        Arrays.stream(arr)
            .boxed()
            .forEach(
                it -> {
                    if (stack.isEmpty() || it != stack.peek()) {
                        stack.push(it);
                    }
                }
            );

        return stack.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }

    private static int getPrevious(int[] arr, int currentIndex) {
        if (currentIndex > 0) {
            return arr[currentIndex - 1];
        }
        return -1; // Use a value that is not present in the array to indicate no previous element.
    }
}
