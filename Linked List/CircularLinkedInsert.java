public class CircularLinkedInsert{

    Node head;
     class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
            this.next= null;
        }
     }

    void InsertAtBeginging(int data){
        Node newNode = new Node(data);
        Node current = head;
        if(head == null){
            head = newNode;
            newNode.next = head;
            return;
        }

        while(current.next!=head){
            current=current.next;
        }

        newNode.next = head;
        current.next = newNode;
        head = newNode;
    }

    void InsertAtEnd(int data){
        Node NewNode = new Node(data);

        Node current = head;
        if(head == null){
            head = NewNode;
            NewNode.next= head;
            return;
        }



        while(current.next!=head){
            current =current.next;
        }

        current.next = NewNode;
        NewNode.next = head;
        
    }

    void DeleteFront(){

        if(head ==null){
            System.out.println("No Node Exist");
            return;
        }

        if(head.next == head){
            head = null;
            return;
        }

        Node current = head;

        while(current.next!=head){
            current=current.next;
        }

        head = head.next;
        current.next = head;

    }

    void DeleteEnd(){
        Node current = head;
        if(head == null){
            System.out.println("No Node Exist");
            return;
        }

        if(head.next==head){
            head = null;
            return;
        }

        while(current.next.next!=head){
            current=current.next;
        }
    
        current.next= head;
        
    }

    void AddAfter(int target,int data){
        Node newnode = new Node(data);
        Node current = head;

        if(head == null){
            System.out.println("No node exist");
            return;
        }

        if(current.data==target){
            newnode.next = current.next;
            current.next = newnode;
            return;
        }

     while(current!=head && current.data!=target){
        current = current.next;
     }
        
        if(current == head){
            System.out.println("Node does not exist!");
            return;
        }
        newnode.next = current.next;
        current.next = newnode;
 
    }

    void InsertBefore(int target,int data){
        Node newnode = new Node(data);
        Node current = head;

        if(head == null){
            System.out.println("no node exist");
            return;
        }

        if(current.data==target){
        newnode.next = head;
        current.next = newnode;
        head = newnode;
        return;
    }


        while(current.next.next.data!=target){
            current = current.next;
        }

         newnode.next =  current.next;
         current.next = newnode;

    }

    void deleteAfter(int target){
        Node current =head;

        while(current.next.data!=target){
            current = current.next;
        }
         current.next =current.next.next;
    }
    
    boolean search(int target){
            Node current = head;

            do{
                if(current.data==target){
                    return true;
                }
               current = current.next;
            
    }    while(current!=head);
            return false;

 }

    void Update(int target,int newvalue){
        Node current = head;

        while( current.data!=target){
            current = current.next;
        }

        if(current!=head){
            System.out.println("Required Node is not exist");
            return;
        }

            current.data = newvalue;
    }

    
        void Display(){
            Node temp1=head;

            do {
                System.out.print(temp1.data+" ");
                temp1=temp1.next;
            }while(temp1!=head);
        }


        /*void DisplayEnd(){
            Node temp2=head;

            do{
                System.out.print(temp2.data+" ");
                temp2=temp2.next;
            }while(temp2!=head);

        }*/
    

    public static void main(String [] args){
        CircularLinkedInsert CL=new CircularLinkedInsert();

        
        CL.InsertAtBeginging(40);
        CL.InsertAtBeginging(30);
        CL.InsertAtBeginging(20);
        CL.InsertAtBeginging(10);

        CL.InsertAtEnd(50);
        CL.InsertAtEnd(60);
        CL.InsertAtEnd(70);
        CL.InsertAtEnd(80);

    /*   CL.AddAfter(70,65);
        CL.InsertBefore(50,45);

        CL.DeleteFront();
        CL.DeleteEnd();
        CL.deleteAfter(50);*/
        CL.Update(20,25);
        CL.Display();
       // boolean found = CL.search(70);
       // System.out.println("Found :"+found);
        
    }
}