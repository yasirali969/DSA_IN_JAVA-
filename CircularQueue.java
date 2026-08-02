class CircularQueue {

    int[] queue;
    int front, rear, size, capacity;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    // Insert (Enqueue)
    public void enqueue(int data) {

        if (size == capacity) {
            System.out.println("Queue is Full");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear = (rear + 1) % capacity;
        queue[rear] = data;
        size++;

        System.out.println(data + " inserted");
    }

    // Remove (Dequeue)
    public void dequeue() {

        if (size == 0) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println(queue[front] + " removed");

        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % capacity;
        }

        size--;
    }

    // Peek
    public void peek() {

        if (size == 0) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Front Element: " + queue[front]);
        }
    }

    // Display Queue
    public void display() {

        if (size == 0) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("Queue: ");

        int i = front;

        while (true) {

            System.out.print(queue[i] + " ");

            if (i == rear)
                break;

            i = (i + 1) % capacity;
        }

        System.out.println();
    }
}