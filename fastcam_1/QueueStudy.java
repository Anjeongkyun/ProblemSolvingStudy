package fastcam_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class QueueStudy {
    public static void main(String[] args) {

        MyQueue<Integer> mq = new MyQueue<Integer>();
        mq.enqueue(1);
        mq.enqueue(2);
        mq.enqueue(3);
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());

    }

    public static class MyQueue<T> {
        private ArrayList<T> queue = new ArrayList<T>();

        public void enqueue(T item){
            queue.add(item);
        }

        public T dequeue(){
            if(queue.isEmpty())
                return null;

            return queue.remove(0);
        }

        public boolean isEmpty(){
            return queue.isEmpty();
        }

    }
}
