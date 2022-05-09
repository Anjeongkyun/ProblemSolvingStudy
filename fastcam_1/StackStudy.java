package fastcam_1;

import java.util.ArrayList;
import java.util.Stack;

public class StackStudy {
    public static void main(String[] args) {
        Stack<Integer> stack_int = new Stack<Integer>();

        stack_int.push(1);
        stack_int.push(2);
        stack_int.push(3);

        System.out.println(stack_int);

        stack_int.pop();
        System.out.println(stack_int);

        stack_int.pop();
        System.out.println(stack_int);

        stack_int.pop();
        System.out.println(stack_int);

    }

    public class MyStack<T>{
        private ArrayList<T> stack = new ArrayList<T>();

        public void push(T item){
            stack.add(item);
        }

        public T pop(){
            if(isEmpty()){
                return null;
            }

            return stack.remove(0);
        }

        public boolean isEmpty(){
            return stack.isEmpty();
        }
    }
}
