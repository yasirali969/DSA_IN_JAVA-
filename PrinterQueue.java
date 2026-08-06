public class PrinterQueue {
    String[] queue = new String[3];
    int front = -1, rear = -1;

    void enqueue(String document) {
        if (rear == queue.length - 1) {
            System.out.println("Queue is Full");
            return;
        }

        if (front == -1)
            front = 0;

        queue[++rear] = document;
    }

    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Printing: " + queue[front]);
        front++;
    }

    void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {

        PrinterQueue pq = new PrinterQueue();

        pq.enqueue("File1");
        pq.enqueue("File2");
        pq.enqueue("File3");

        pq.display();

        pq.dequeue();

        pq.display();
    }
}