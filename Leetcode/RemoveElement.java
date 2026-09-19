class RemoveElement{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
        RemoveElement(){
            head = null;
     }

    void insert(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }

        newnode.next = head;
        head = newnode;
    }

    void display(){
        Node current = head;
        while(current!=null){
            System.out.println(current.data+" ");
            current = current.next;
        }
    }

    void RemoveElement(int val){
        Node current = head;

        if(head == null){
            System.out.println("Empty linkedlist!");
            return;
        }


        if(head.data == val){
            head = head.next;
            return;
        }

        while(current.next!=null && current.next.data!=val){
            
            current = current.next;
        }

        if(current.next==null){
                System.out.println("value does not exist!");
                return;
        }

    
         current.next = current.next.next;
    }

     public static void main(String []args){
        RemoveElement RE = new RemoveElement();
        RE.insert(7);
        RE.insert(6);
        RE.insert(5);
        RE.insert(4);
        RE.insert(3);
        RE.insert(2);
        RE.insert(1);
        RE.RemoveElement(8);
        RE.display();
}
}