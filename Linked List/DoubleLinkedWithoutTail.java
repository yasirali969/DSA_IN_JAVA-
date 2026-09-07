public class DoubleLinkedWithoutTail{
    class Node{
        Node next;
        Node prev;
        int data;
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    Node head;

    DoubleLinkedWithoutTail(){
         head = null;
    }

    void AddFront(int data){
        Node Newnode = new Node(data);

        if(head == null){
            head = Newnode;
            return;
        }

        Newnode.next = head;
        head.prev = Newnode;
        head = Newnode;
    }

    void AddBack(int data){
        Node NewNode = new Node(data);

        if(head == null){
            head=NewNode;
            return;
        }

        Node current = head;

        while(current.next!=null){
            current = current.next;
        }

        current.next = NewNode;
        NewNode.prev = current;

    }

    void AddAfter(int target,int NewValue){
        Node Newnode = new Node(NewValue);
        Node current = head;
        if(head == null){
            System.out.println("No Node exist after target");
            return;
        }

        while(current.data!=target){
            current = current.next;
        }

        if(current== null){
                System.out.println("Target does not exist!");
                return;
            }

        Node NewNoded = current.next;
        Newnode.next = NewNoded;
        current.next = Newnode;
        Newnode.prev = current;
        NewNoded.prev =Newnode;

    }

        void AddBefore(int target , int NewVal){
            Node newnode = new Node(NewVal);
            if(head == null){
                System.out.println("Empty linkedlist");
                return;
            }

            if(head.data == target){
                 newnode.next = head;
                 head.prev = newnode;
                 head = newnode;
                 return;
            }
            Node current = head;

            while (current.next!=null && current.next.data!=target){
                current = current.next; 
            }

            if(current.next== null){
                System.out.println("Target does not exist!");
                return;
            }


             Node NewNod = current.next;
             newnode.next = NewNod;
             newnode.prev = current;

             current.next= newnode;
             NewNod.prev = newnode;

        }

        void DeleteFront(){
            if(head == null){
                System.out.println("Empty Linkedlist");
                return;
            }

            if(head.next==null){
                head = null;
                return;
            }

            head = head.next;
            head.prev = null;


        }
        void DeleteBack(){
            if(head == null){
                System.out.println("Empty linked list!");
                return;
            }

            if(head.next == null){
                head = null;
                return;
            }
            
            Node current = head;
            while(current.next!=null){
                current = current.next;
            }
            current.prev.next=null;
        }

        void DeleteAfter(int target){
            // Empty Linkedlist
            if(head == null){
                System.out.println("Empty LinkedList!");
                return;
            }

            // Single Node case
            if(head.data == target && head.next == null){
                System.out.println("No node after Target");
                return;
            }
            Node current = head;
        // check if target is null && not equal to target 
            while(current!=null && current.data!=target){

                current = current.next;
            }

            // Target does not exist
            if(current == null){
                System.out.println("Target does not exist!");
                return;
            }

            // No nodes exist after target
            if(current.next==null){
                System.out.println("Target does not exist!");
                return;

            }
            current.next = current.next.next;
            
            if(current.next!=null){
                current.next.prev = current;
            }

        }

        void Delete(int target){
            if(head == null){
                System.out.println("Empty linkedlist!");
                return;
            }

        // if head is target node
            if(head.data == target){
                 head = head.next;

                if(head != null){
                    head.prev = null;
                }
                 return;
            }    

        Node current = head;

        while(current!=null && current.data!=target){
                current = current.next;
            }

        if(current == null){
            System.out.println("Node does not exist");
            return;
        }
            
            current.prev.next = current.next;
            if(current.next!=null){
                current.next.prev = current.prev;
            }    
        
    }

     boolean Search(int target){
        if(head == null){
            System.out.println("Empty Linkedlist!");
            return false;
        }
        Node current = head;
        

        while(current!=null){
            if(current.data==target){
                return true;
            }
            current=current.next;
        }

        if(current==null){
            System.out.println("Target does not find!");
            return false;
        }
        return false;
     }

     void Update(int target,int NewVal){
        Node current = head;
        if(head == null){
            System.out.println("Empty Linkedlist!");
            return;
        }

        while(current!=null && current.data!=target){
            current = current.next;
        }
        if(current==null){
            System.out.println("Target does not find!");
            return;
        }
        current.data = NewVal;
     }
    void Display(){
           
            Node temp1=head;

            while(temp1!=null){
                System.out.print(temp1.data+" ");
                temp1=temp1.next;
            }
    }

    public static void main(String []args){
        DoubleLinkedWithoutTail DL = new DoubleLinkedWithoutTail();
        DL.AddFront(45);
        DL.AddFront(35);
        DL.AddFront(25);
        DL.AddBack(55);
        DL.AddBack(65);
        DL.AddBack(75);
        DL.AddAfter(65,70);
        DL.AddAfter(45,50);
    //   DL.AddBefore(45,40);
        DL.AddBefore(35,33);
        DL.DeleteFront();
        DL.DeleteBack();
      DL.DeleteAfter(55);
      DL.Delete(55);
      boolean Found =DL.Search(90);
      System.out.println("Found ="+ Found);
      DL.Update(35,80);
        DL.Display();
    }
}