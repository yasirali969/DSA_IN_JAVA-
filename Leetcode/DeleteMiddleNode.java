class DeleteMiddleNode{
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            this.next = null;
            prev = null;
        }
    }
    Node head;
    int size;
        DeleteMiddleNode(){
            head = null;
            size = 0;
     }

     void insert(int data){
        Node newnode = new Node(data);

        if(head == null){
            head = newnode;
            head.prev = null;
            size++;
            return;
        }

        newnode.next = head;
        head.prev = newnode;
        head = newnode;
        size++;
     }

     void RemoveMiddle(){
        Node current = head;
        Node prev = null;
        int n = size /2;
        while(current!=null && n>0){
            prev = current;
            current = current.next;
            n--;
        }  
        current.prev.next = current.next;
        size--;

     }
     int size(){
        return size;
     }

      void display(){
        Node current = head;
        while(current!=null){
            System.out.println(current.data+" ");
            current = current.next;
        }
    }

     public static void main(String []args){
        DeleteMiddleNode DMN = new DeleteMiddleNode();
    /*    DMN.insert(7);
        DMN.insert(6);
        DMN.insert(5);
        DMN.insert(4);
        DMN.insert(3);*/
        DMN.insert(2);
        DMN.insert(1);
        DMN.RemoveMiddle();
        System.out.println("Size ="+DMN.size());
        DMN.display();
     }
    
}