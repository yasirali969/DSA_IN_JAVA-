class PQueue{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
        PQueue(){
            head = null;
        }

    public void insert(int value){
        Node Newnode = new Node(value);

        if(head == null){
            head = Newnode;
            return;
        }
        Node temp = head;

        while(temp.next!=null){
            temp = temp.next;
        }

        temp.next = Newnode;
    }

    public int extractMax(){
        if(head==null){
            throw new RuntimeException("Queue is Empty!");
        }
        Node current =head;
        Node prev = null;

        Node maxNode = head;
        Node maxprev = null;

        while(current!=null){
            if(current.data>maxNode.data){
                maxNode = current;
                maxprev = prev;
            }

            prev = current;
            current = current.next;
        }

        if(maxprev == null){
            head = head.next;
        }
        else {
        maxprev.next = maxNode.next;
        }
        return maxNode.data;
    }

    

    void Display(){
        Node temp = head;

        while(temp!=null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String []ars){
        PQueue  PQ = new PQueue();
        PQ.insert(10);
        PQ.insert(20);
        PQ.insert(30);
        System.out.println("Before getting Max!");
        PQ.Display();
        System.out.println("After getting Max!");
        PQ.extractMax();
        PQ.Display();
    }
}