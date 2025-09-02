package stackandqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Inbuiltexamples {
    public static void main(String[] args) {
//        Stack Examples::::
//        Stack<Integer> stack=new Stack<>();
//
//        stack.push(15);
//        stack.push(16);
//        stack.push(17);
//        stack.push(18);
//        stack.push(19);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        Queue<Integer> queue=new LinkedList<>();
        queue.add(6);
        queue.add(5);
        queue.add(4);
        queue.add(3);
        queue.add(2);
        queue.add(1);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}
