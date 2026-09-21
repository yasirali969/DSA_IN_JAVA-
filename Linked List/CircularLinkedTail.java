class CircularLinkedTail{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    Node tail;
        CircularLinkedTail(){
             head = null;
             tail = null;
        }

    void AddFront(int data){
        Node newnode = new Node(data);

        if(head == null){
            head = newnode;
            tail = newnode;
            tail.next = head;
            return;
        }

         newnode.next = head;
         head = newnode;
         tail.next = head;
    }

    void AddBack(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            tail = newnode;
            tail.next = head;
            return;
        }


        newnode.next = head;
        tail.next = newnode;
        tail = newnode;
        
    }

    void AddAfter(int target , int data){
        Node newnode = new Node(data);
        if ( head == null){
            head = newnode;
            tail = newnode;
            tail.next = newnode;
            return;
        }

        if(target == tail.data){
               newnode.next = head;
               tail.next = newnode;
               tail = newnode;
               return;
            }

        Node current = head;

        while(current.next!=head){
            if(current.data == target){
                 newnode.next = current.next;
                 current.next = newnode;
                 return;
            }
            current = current.next;
            
        }


         
    }


    void AddBefore(int target , int data){
        Node newnode = new Node(data);

        if(head == null){
            head = newnode;
            tail = newnode;
            tail.next = newnode;
            return;
        }

        if(head.data == target){         
            newnode.next = head;
            tail.next = newnode;
            head = newnode;
            return;
        }

        Node current = head;
        while(current.next!=head && current.next.data!=target){
                current = current.next;
        }

        newnode.next = current.next;
        current.next = newnode;


    }

    void DeleteFront(){
        if(head == null){
            System.out.println("Empty Linkedlist!");
            return;
        }

        if(head == tail){
            head = null;
            tail = null;
            return;
        }
        head = head.next;
        tail.next = head;
    }

    void DeleteBack(){
        if(head == null){
            System.out.println("Empty linkedlist!");
            return;
        }

        if(head == tail){
            head = null;
            tail = null;
            return;
        }

        Node current = head;
         while(current.next != tail){
            current = current.next;
         }

            tail = current;
            tail.next = head;
    }

    void Delete(int target){
        if(head == null){
            System.out.println("Empty linkedlist!");
            return;
        }

        if(head.data == target && head ==tail){
            head = head.next;
            tail.next = head;
            return;
        }


        Node current = head;
        while(current.next!=head && current.next.data != target){
            current = current.next;
        }

        if(current.next==tail){
            tail = current;
            tail.next = head;
            return;
        }

        if(current.next == head){
            System.out.println("Target does not exist!");
            return;
        }

        current.next = current.next.next; 
    }
    void Display(){
        Node current = head;

        do{
            System.out.println(current.data+" ");
            current = current.next;
        }while(current!=head);
    }
    public static void main(String []args){
        CircularLinkedTail CL = new CircularLinkedTail();
       
       //  Add Front
        CL.AddFront(50);
        CL.AddFront(40);
        CL.AddFront(30);
        CL.AddFront(20);
        CL.AddFront(10);

        // Add Back
        CL.AddBack(60);
        CL.AddBack(80);
        CL.AddBack(100);
        CL.AddBack(120);
        CL.AddBack(140);

        // Add After
        CL.AddAfter(140,150);

        // Add Before
        CL.AddBefore(150,145);

        // Delete Front
        CL.DeleteFront();

        // Delete Back
        CL.DeleteBack();

        // Delete
        CL.Delete(120);


        CL.Display();
    }
}