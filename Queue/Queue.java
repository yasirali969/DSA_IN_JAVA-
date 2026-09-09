class Queue{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node Front;
    Node rear;
    int size;

        Queue(){
            Front = null;
            rear  = null;
            size  = 0;
        }

        void Enqueue(int data){
            Node Newnode = new Node(data);

            if(rear == null){
                Front = Newnode;
                rear  = Newnode;
            }

            else {
                rear.next = Newnode;
                rear = Newnode;
            }

            size ++;
            System.out.println(data +" Enqueued");

        }

        int Dequeue(){
            if(IsEmpty()){
                System.out.println("Queue is Empty!");
                return -1;
            }

            int value = Front.data;

            Front = Front.next;

            if(Front==null){
                rear = null;
            }

            size--;
            return value;
        }

        boolean IsEmpty(){
            return Front == null;
        }

        boolean IsFull(){
            return false;
        }

        void DisplayQueue(){
            if(IsEmpty()){
                System.out.println("Queue is Empty!");
                return;
            }

            Node current = Front;

            while(current!=null){
                System.out.println(current.data+" ");
                current = current.next;
            }
            System.out.println();
        }

        int Peek(){

            if(IsEmpty()){
                System.out.println("Queue is Empty!");
                return -1;
            }

            return Front.data;
        }

        int Size(){
            return size;
        }

   public static void main(String []args){
     Queue Q = new Queue();
     Q.Enqueue(5);
     Q.Enqueue(10);
     Q.Enqueue(15);
     System.out.println("Queue");
     Q.DisplayQueue();
      System.out.println("Peek: " + Q.Peek());

        System.out.println("Dequeued: "+Q.Dequeue());

        System.out.println("Queue after Dequeue:");
        Q.DisplayQueue();

        System.out.println("Size: " +Q.Size());

        System.out.println("Is Empty: " + Q.IsEmpty());
        System.out.println("Is Full: " + Q.IsFull());
   }
}