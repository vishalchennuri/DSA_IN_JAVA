package DSA.Queues;

import java.util.*;

public class RevQueue {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i=1;i<=10;i++){
            queue.add(i);
        }

        System.out.println(queue);

        reverseQueue(queue);

        System.out.println(queue);
    }

    public static void reverseQueue(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();
        while(!queue.isEmpty()){
            stack.push(queue.remove());
        }
        while(!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }


}
