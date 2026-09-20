class Linkedlist1{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
        Linkedlist1(){
            head = null;
        }

    void addFront(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }

        newnode.next = head;
        head = newnode;
    }

    void addBack(int data){
        Node Newnode = new Node(data);

        // if head null
        if(head == null){
            head = Newnode;
            return;
        }

        if(head.next == null){
            head.next = Newnode;
            return;
        }

        Node current = head;
        while(current.next!=null){
            current = current.next;
        }
            current.next = Newnode;
    }

    // Delete Front

    void DeleteFront(){
        if(head == null){
            System.out.println("Empty Linkedlist!");
            return;
        }

        if(head.next == null){
            head = null;
            return;
        }

        head = head.next;
    }

    void DeleteBack(){
        if(head == null){
            System.out.println("Empty Linkedlist!");
            return;
        }

        if(head.next == null){
            head = null;
            return;
        }

        Node current = head;
        while(current.next.next!=null){
            current = current.next;
        }

            current.next= null;
    }
    void display(){
        Node current = head;

        while(current!=null){
            System.out.println(current.data+" ");
            current = current.next;
        }
    }

    void addafter(int target ,int data){
        Node newnode = new Node(data);

        if(head == null){
            System.out.println("Empty linkedlist!");
            return;      
        }

        if(head.data == target){
            newnode.next = head.next;
            head.next = newnode;
            return;
        }

        Node current = head;

        while(current.data!=target){
            current = current.next;
        }
            newnode.next =current.next;
            current.next = newnode;
    }

    void addbefore(int target , int data){
        Node newnode = new Node(data);
        if(head == null){
            System.out.println("Empty linkedlist!");
            return;
        }

        if(head.data == target){
            newnode.next = head;
            head = newnode;
            return;
        }


        Node current = head;
        Node prev = null;

        while(current.next!=null && current.next.data!=target){
             current = current.next;
        }

         if (current.next == null) {
        System.out.println("Target does not exist!");
        return;
    }

        
            newnode.next = current.next;
            current.next = newnode;

    }

    boolean searchNode(int Searchdata){
        if(head == null){
            System.out.println("Empty Linkedlist!");
            return false;
        }

        if(head.data == Searchdata){
            System.out.println("FOund!");
            return true;
        }

        Node current = head;
        while(current!= null){
            if(current.data == Searchdata){
                return true;
            }
            current = current.next;
        }
         return false;
    }

    void  UpdateNode(int target , int value){
          if( head == null){
            System.out.println("Empty linkedlist!");
            return;
          }

          Node current = head;

          if(current.data == target){
              head.data = value;
              return;
          }

          while(current.next!=null && current.data!=target){
            current = current.next;
          }
         
          if (current.next == null) {
        System.out.println("Target does not exist!");
        return;
    }


          current.data = value;
    }

    void DeleteNode(int target){
        if(head == null){
            System.out.println("Empty Linkedlist!");
            return;
        }

        if(head.data == target){
            head = head.next;
            return;
        }

        Node current = head;
        while(current!=null){
            if(current.next!=null && current.next.data == target){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }

         if (current.next == null) {
        System.out.println("Target does not exist!");
        return;
    }

    }


    public static void main(String []args){
        Linkedlist1 L1 = new Linkedlist1();
    // insertion front
        L1.addFront(5);
        L1.addFront(4);
        L1.addFront(3);
        L1.addFront(2);
        L1.addFront(1);
        L1.addFront(0);
    // insertion back
        L1.addBack(6);
        L1.addBack(7);
        L1.addBack(8);
    
    // DeleteFront
       L1.DeleteFront();
    
    // DeleteBack 
        L1.DeleteBack();

    L1.addafter(5,55);
    L1.addbefore(7,66);

    // searching
    System.out.println("Found ="+L1.searchNode(5));

    // Update Node
    L1.UpdateNode(4,44);

    // Delete Node
    L1.DeleteNode(55);

    // Display
        L1.display();
    }
}