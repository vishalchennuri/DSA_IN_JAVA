package DSA.Stacks;

class Stack2{
    int[] arr;
    int top;
    int capacity;
    Stack2(int size){
        top = -1;
        capacity = size;
        arr = new int[capacity];
    }
    boolean isEmpty(){return top==-1;}

    boolean isFull(){return top == capacity-1;}

    int peek(){return arr[top];}

    int size(){return top+1;}

    boolean push(int x){
        if(isFull()){System.out.println("Stack Overflow");return false;}
        arr[++top]= x;
        return true;
    }
    int pop(){
        if(isEmpty()){return Integer.MIN_VALUE;}
        return arr[top--];
    }
}

public class Stack_2 {
    public static void main (String[] args)
    {
        Stack2 s = new Stack2(5);
        s.push(5);
        s.push(10);
        s.push(15);
        s.push(20);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.isEmpty() ? "Stack is Empty" : "Stack is not Empty");
        System.out.println(s.isFull() ? "Stack is Full" : "Stack is not Full");
    }

}
