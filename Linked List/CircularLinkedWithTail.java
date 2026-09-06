class CircularLinkedWithTail{
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    Node Tail;
    CircularLinkedWithTail(){
        head = null;
        Tail = null;
    }

    void AddFront(int data){
        Node NewNode = new Node(data);

        if(head == null){
            head = NewNode;
            Tail = NewNode;
            NewNode.next=head;
            return;
        }

        
        NewNode.next = head;
        Tail.next = NewNode;
        head = NewNode;
    }

    void AddBack(int data){
        Node NewNode = new Node(data);
        if(head == null){
            head = NewNode;
            Tail = NewNode;
            NewNode.next = head;
            return;
        }

        NewNode.next = head;
        Tail.next = NewNode;
        Tail = NewNode;

    }

    void Addbefore(int target,int data){
        Node NewNode =  new Node(data);

        if(head == null){
            System.out.println("List is empty");
            return;
}

        if(head.data==target){
            NewNode.next =  head;
            Tail.next =  NewNode;
            head  =  NewNode;
            return;
        }
        Node current = head;

        while(current.next!=head){
            if(current.next.data==target){
                NewNode.next = current.next;
                current.next = NewNode;
                return;
            }
            current =  current.next;
        }
        
        System.out.println("Target Not found!");
    }

    void AddAfter(int target,int data){
        Node Newnode =  new Node(data);

        if(head==null){
            System.out.println(" List is empty");
            return;
        }


        if(target==Tail.data){
            Newnode.next = head;
            Tail.next = Newnode;
            Tail = Newnode;
            return;
        }

        Node current = head;
        while(current.next!=head){
            
            if(current.data==target){
                Newnode.next = current.next;
                current.next = Newnode;
                return;
            }
            current = current.next;
        }

            System.out.println("Target does not exist");
        
    }

    void DeleteFront(){
        if (head == null){
            System.out.println("No Linkedlist exist");
            return;
        }

        if(head.next == head){
            head = null;
            Tail = null;
            return;
        }
        head = head.next;
        Tail.next = head;
    }

    void DeleteAfter(int target){
        if(head ==null){
            System.out.println("NO node exist");
            return;
        }

        if(head.next == head){
            System.out.println("No node exist after target");
            return;
        }

        
        Node current = head;

        while(current.next!=head){
            if(current.data==target){

                if(current.next==Tail){
                    current.next =head;
                    Tail = current;
                    return;
                }
                current.next=current.next.next;
                return;
            }
            current=current.next;
        }

        System.out.println("Target Does not exist!");
    }

    
    
    void Delete(int target){
        if(head == null){
            System.out.println("No Node exist!");
            return;
        }

        if(head.next == head){

            if(head.data==target){
            head = null;
            Tail = null;
        }
            else{
                System.out.println("No Node exist!");
            }
            return;
        }
        

        Node current = head;
        Node prev = Tail;

        while(current.next!=head){

            if(current == head  && current.data==target){
                head = head.next;
                Tail.next = head;
                return;
            }

            if(current==Tail && current.data==target){
                prev.next = head;
                Tail = prev;
                return;
            }
            if(current.data==target){
                prev.next=current.next;
                return;
            }
             prev = current;

            current = current.next;
        }

        System.out.println("Target does not exist!");
}

    
    boolean Search(int target){
        Node current =  head;
        if(head == null){
            System.out.println("No Linkedlist exist!");
            return false;
        }

        

       do{
            if(current.data==target){
                return true;
            }
            current=current.next;
        } while(current!=head);
       
        return false;
    }

    void UpdateNode(int target , int NewValue){
        Node current =  head;
        if(head == null){
            System.out.println("No node exist to update!");
            return;
        }

        if(head.data == target){
            head.data = NewValue;
            return;
        }

        while(current.data!=target){
            current =  current.next;
        }

        if(current==head){
            System.out.println("Target Node does not exist!");
            return;
        }
            current.data = NewValue;
    }
    void Display(){
            if(head == null){
                System.out.println("No Node exist!");
                return;
            }
            Node temp1=head;

            do {
                System.out.print(temp1.data+" ");
                temp1=temp1.next;
            }while(temp1!=head);
        }

    public static void main(String []args){
        CircularLinkedWithTail CT = new CircularLinkedWithTail();
        CT.AddFront(65);
        CT.AddFront(55);
        CT.AddFront(45);
        CT.AddFront(35);

        CT.AddBack(70);
        CT.AddBack(75);
        CT.AddBack(80);

        CT.Addbefore(75,72);
        CT.AddAfter(45,50);
 //       CT.DeleteFront();
 //       CT.DeleteFront();
        CT.DeleteAfter(70);
        CT.Delete(70);
        CT.UpdateNode(45,46);
        CT.Display();
        boolean found = CT.Search(93);
        System.out.println("Found  :"+ found);
    }
}
