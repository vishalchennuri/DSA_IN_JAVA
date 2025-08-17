package DSA.Queues;



class Method2 {
    int front, rear, size;
    int capacity;
    int[] array;

    Method2(int cap) {
        capacity = cap;
        front = size = 0;
        rear = capacity - 1;
        array = new int[capacity];
    }

    // Queue is full when size becomes equal to the capacity
    boolean isFull() {
        return (size == capacity);
    }

    // Queue is empty when size is 0
    boolean isEmpty() {
        return (size == 0);
    }

    // Method to add an item to the queue. It changes rear and size
    void enqueue(int item) {
        if (isFull())
            return;
        rear = (rear + 1) % capacity;
        array[rear] = item;
        size = size + 1;
        System.out.println(item + " enqueued to Queue");
    }

    // Method to remove an item from the queue. It changes the front and size
    int dequeue() {
        if (isEmpty())
            return Integer.MIN_VALUE;
        int item = array[front];
        front = (front + 1) % capacity;
        size = size - 1;
        System.out.println(item + " dequeued from the Queue");
        return item;
    }

    // Method to get front of queue
    int front() {
        if (isEmpty())
            return Integer.MIN_VALUE;
        return array[front];
    }

    // Method to get rear of queue
    int rear() {
        if (isEmpty())
            return Integer.MIN_VALUE;
        return array[rear];
    }
}



