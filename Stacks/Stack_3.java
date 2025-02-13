package DSA.Stacks;

import java.util.ArrayList;

class Stack3{
    ArrayList<Integer> list = new ArrayList<>();

    void push(int x){
        list.add(x);
    }
    int pop(){
        if(size()>=1) {
            int res = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return res;
        }else{
            return Integer.MIN_VALUE;
        }
    }
    int peek(){
        if(size()>=1) {
            return list.get(list.size() - 1);
        }else{
            return Integer.MIN_VALUE;
        }
    }
    int size(){
        return list.size();
    }
    boolean isEmpty(){
        return size()>=1;
    }
}
public class Stack_3 {
    public static void main (String[] args)
    {
        Stack3 s = new Stack3();
        s.push(5);
        s.push(10);
        s.push(15);
        s.push(20);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.isEmpty() ? "Stack is Empty" : "Stack is not Empty");
    }


}
