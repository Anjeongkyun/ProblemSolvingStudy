package fastcam_1;

import java.util.LinkedList;
import java.util.Queue;

public class QueueStudy {
    public static void main(String[] args) {
        Queue<Integer> queue_int = new LinkedList<Integer>();
        Queue<String> queue_str = new LinkedList<String>();

        //queue 데이터 add, offer 추가. -> Enqueue
        queue_int.add(1);
        queue_int.offer(2);

        System.out.println(queue_int);
    }
}
