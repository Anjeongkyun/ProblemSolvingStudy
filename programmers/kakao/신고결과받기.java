package programmers.kakao;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class 신고결과받기 {
    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;

        HashMap<String, HashSet<String>> reportMap = new HashMap<>();
        HashMap<String, Integer> getMailCntMap = new HashMap<>();

        for(String id : id_list){
            getMailCntMap.put(id, 0);
            reportMap.put(id, new HashSet<>());
        }

        for (String r : report) {
            String[] str = r.split(" ");
            reportMap.get(str[1]).add(str[0]);
        }

        for(String key : reportMap.keySet()){
            HashSet<String> reporters = reportMap.get(key);
            if (reporters.size() >= k) {
                for (String reporter : reporters) {
                    int mailCnt = getMailCntMap.get(reporter);
                    getMailCntMap.put(reporter, mailCnt + 1);
                }
            }
        }

        int[] answer = new int[id_list.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = getMailCntMap.get(id_list[i]);
        }

        System.out.println(Arrays.toString(answer));

    }
}
