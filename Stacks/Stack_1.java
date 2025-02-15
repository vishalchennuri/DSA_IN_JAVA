package DSA.Stacks;

import java.util.Stack;

class Stack1{
    static final int MAX = 10;
    int top;
    int[] a = new int[MAX];

    Stack1(){
        top = -1;
    }

    boolean push(int x){
        if(top>=MAX-1){
            System.out.println(" Stack Overflow");
            return false;
        }else{
            a[++top] = x;
            System.out.println(x+" pushed into the stack");
            return true;
        }
    }
    int pop(){
        if(top<0){
            System.out.println("Stack underflow");
            return Integer.MIN_VALUE;
        }else{
            int x = a[top--];
            return x;
        }
    }
    int peek(){
        if(top<0){
            System.out.println("stack underflow");
            return Integer.MIN_VALUE;
        }else{
            return a[top];
        }
    }

    int size(){
        return top+1;
    }
    boolean isEmpty(){
        return top==-1;
    }
    boolean isFull(){
        return top == MAX-1;
    }
}

public class Stack_1 {
    public static void main(String[] args) {
        Stack1 s = new Stack1();
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        System.out.println(s.pop()+" is popped");
        System.out.println(s.peek() + " is top element");
        System.out.println(s.size());
        System.out.println(s.isEmpty());
        System.out.println(s.isFull());
    }
}
