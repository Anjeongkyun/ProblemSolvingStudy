package lectureStudy.Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

// 너비우선탐색
public class BFS {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> graph = new HashMap<String, ArrayList<String>>();

        graph.put("A", new ArrayList<String>(Arrays.asList("B", "C")));
        graph.put("B", new ArrayList<String>(Arrays.asList("A", "D")));
        graph.put("C", new ArrayList<String>(Arrays.asList("A", "G", "H", "I")));
        graph.put("D", new ArrayList<String>(Arrays.asList("B", "E", "F")));
        graph.put("E", new ArrayList<String>(Arrays.asList("D")));
        graph.put("F", new ArrayList<String>(Arrays.asList("D")));
        graph.put("G", new ArrayList<String>(Arrays.asList("C")));
        graph.put("H", new ArrayList<String>(Arrays.asList("C")));
        graph.put("I", new ArrayList<String>(Arrays.asList("C", "J")));
        graph.put("J", new ArrayList<String>(Arrays.asList("I")));

        System.out.println(bfsFunc(graph, "A"));
    }

    private static ArrayList<String> bfsFunc(HashMap<String, ArrayList<String>> graph, String startNode) {

        //방문한 노드 List
        ArrayList<String> visited = new ArrayList<String>();

        //방문 필요한 노드 List
        ArrayList<String> needVisit = new ArrayList<String>();

        needVisit.add(startNode);

        while(needVisit.size() > 0){
            //BFS는 큐의 구조를 갖는다.
            String node = needVisit.remove(0);

            //방문 리스트에 없는 노드면 추가.
            if(!visited.contains(node)){
                visited.add(node);
                needVisit.addAll(graph.get(node));
            }
        }

        return visited;
    }
}
