class QueueUsingArray{
    int[]queue;
    int front;
    int rear;
    int size;

     QueueUsingArray(int capacity){
        queue = new int[capacity];
        front = 0;
        rear  = 0;
        size  = 0;
     }

     // Enqueue
     void Enqueue(int data){
        if(IsFull()){
            System.out.println("Queue is Full");
            return;
        }

        rear++;
        queue[rear] = data;
        size++;
     }

     int Dequeue(){
        if(IsEmpty()){
            System.out.println("Queue is Empty!");
            return -1;
        }
        int val = queue[front];
        front++;
        size--;

        return val;
     }

        boolean IsEmpty() {
        return size == 0;
    }

     // IsFull
     boolean IsFull(){
        return size == queue.length;

     }

      // 5. DisplayQueue
    void DisplayQueue() {

        if (IsEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        QueueUsingArray q = new QueueUsingArray(5);

        q.Enqueue(10);
        q.Enqueue(20);
        q.Enqueue(30);

        System.out.println("Queue:");
        q.DisplayQueue();

        System.out.println("Dequeued: " + q.Dequeue());

        System.out.println("Queue after Dequeue:");
        q.DisplayQueue();

        System.out.println("Is Empty: " + q.IsEmpty());
        System.out.println("Is Full: " + q.IsFull());
    }
}
