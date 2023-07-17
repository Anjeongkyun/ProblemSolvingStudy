package programmers.hash;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class clothes {
    public static void main(String[] args) {
        String[][] clothes1 = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        String[][] clothes2 = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};

        System.out.println(solution(clothes1));
        System.out.println(solution(clothes2));
    }

        public static int solution(String[][] clothes) {
            return Arrays.stream(clothes)
                .collect(
                    Collectors.toMap(
                        c -> c[1],
                        c -> 1,
                        Integer::sum
                    )
                )
                .values()
                .stream()
                .map(it -> it + 1)
                .reduce(1, (a, b) -> a * b) - 1;
        }
    }
