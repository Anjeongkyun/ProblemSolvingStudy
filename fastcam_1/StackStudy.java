package fastcam_1;

import java.util.ArrayList;
import java.util.Stack;

public class StackStudy {
    public static void main(String[] args) {

        MyStack<Integer> stack = new MyStack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }

    public static class MyStack<T>{
        private ArrayList<T> stack = new ArrayList<T>();

        public void push(T item){
            stack.add(item);
        }

        public T pop(){
            if(isEmpty())
                return null;

            return stack.remove(stack.size() -1);
        }

        public boolean isEmpty(){
            return stack.isEmpty();
        }
    }
}
