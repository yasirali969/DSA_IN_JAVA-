class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class LinkedListTail{
    Node head;
    Node Tail;
    LinkedListTail(){
        head = null;
        Tail = null;
    }

    void AddFront(int data){
        Node newNode = new Node(data);
        
        if(head == null){
            head = newNode;
            Tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

    }

    void Addback(int data){
       Node NewNode = new Node(data);

       Node current = head;
       
       if(head==null){
          head = NewNode;
          Tail = NewNode;
          return;
       }

       if(head == Tail){
        head.next = NewNode;
        return;
       }

        while(current.next!=null){
            current=current.next;
        }

        current.next = NewNode;
        Tail = NewNode;
    }

    void AddAfter(int target, int data){
        Node Newnode = new Node(data);
        Node current = head;

        if(head ==null){
            head = Newnode;
            Tail = Newnode;
            return;
        }

        if(head == Tail){
           head.next = Newnode;
           Tail = Newnode;   
           return;
        }

        while(current!=null && current.data!=target){
            current = current.next;
        }

        if(current == null){
            System.out.println("No target Found !");
            return;
        }

        Newnode.next = current.next;
        current.next = Newnode;
        
    }

        void AddBefore(int target , int data){
            Node NewNode = new Node(data);
            Node current = head;
            Node prev = null;
            if(head == null){
                head = null;
                Tail = null;
            }

            if(head == Tail){
                NewNode.next = head;
                head = NewNode;
            }
            while(current !=null && current.data!=target){
                prev = current;
                current = current.next;
            }

            NewNode.next = current;
            prev.next =  NewNode;


        }

    void DeleteFront(){
        

        if(head == Tail || head==null){
            head = null;
            Tail = null;
        }

        head = head.next;
        }

    void DeleteEnd(){

        Node current = head;

        if(head == null){
            System.out.println("No linked list is found!");
            return;
        }
        if(head == Tail){
            head  = null;
            Tail  = null;
            return;
        }

        while(current.next.next!=null){
            current = current.next;
        }
        current.next = null; // problem happen here
        Tail = current;

    }

    void DeleteAfter(int target){
        Node current = head;
        if(head ==null){
            System.out.println("No Linkedlist is found!");
            return;
        }

        if(head == Tail){
            System.out.println("no node exist after this"); // p
            return;
        }

        while(current!=null && current.data!=target){
            current = current.next;
        }

        if(current == null){
            System.out.println("Target is not found!");
            return;
        }

        if(current.next==Tail){
            Tail = current;
        }
        current.next = current.next.next;

    }

    void DeleteBefore(int target){
        Node current = head;

        if(head ==null){
            System.out.println("No node exist");
            return;
        }

        if(head == Tail){
            System.out.println("No node exist before!");
            return;
        }

        if(head.next.data==target){
            head= current.next;
        }

        while(current.next.next!=null && current.next.next.data!=target){
            current=current.next;
        }

        if(current.next==null && current.next.next==null)  // p
        {  
            System.out.println("Target Not exist!");
            return;
        }

        current.next = current.next.next;
    }

    boolean  search(int data){
        Node current  = head;
        if(head == null){
            System.out.println("no linkedlist exist!");
            return false;
        }
        

        while(current.data!=data){
            if(current.data == data){
                return true;
            }
            current=current.next;
        }

        return false;

     }

     void Update(int target ,int updatedvalue){
        Node current  = head ;
        if(head == null){
            System.out.println("No node exist");
            return;
        }

        while(current.data!=target && current!=null){
            
            current=current.next;
        }
                current.data= updatedvalue;   // p
            

     }

    void Display(){
        Node temp = head;

        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("Null");
    }


    public static void main(String []args){
        LinkedListTail LT = new LinkedListTail();
        LT.AddFront(50);
        LT.AddFront(40);
        LT.AddFront(30);

        LT.Addback(60);
        LT.Addback(70);
        LT.Addback(80);
        
        LT.AddAfter(40,90);

        LT.AddBefore(80,75);

        LT.DeleteFront();
        LT.DeleteEnd();                  
        LT.DeleteAfter(70);
        LT.DeleteBefore(60);
        LT.Update(70,140);
        LT.Display();

        System.out.println("Found "+LT.search(40));
    
    }
}
