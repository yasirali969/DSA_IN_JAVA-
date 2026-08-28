class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=next;
    }
}

public class LinkedTail{
    Node head;
    Node Tail;

    LinkedTail(){
        head=null;
        Tail=null;
    }

    void Addfront(int data){
        Node newNode = new Node(data);

        if(head==null){
            head = newNode;
            Tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

    }

    void Addback(int data){
        Node newNode = new Node(data);

        if(head==null){
            head = newNode;
            Tail = newNode;
        }

        Tail.next= newNode;
        Tail = newNode;
    }

     void AddAfter(int target,int data){
        Node newNode = new Node(data);
        Node current = head;
        if(head == null){
            System.out.println("No linkedlis herre");
            return;
        }

        if(current.data == target){
            head.next=newNode;
            Tail = newNode;
            return;
        }


        while (current.data!= target){
                current=current.next;
        }


            if(current.data!=target){
                System.out.println("Target is not exist at all!");
                return;
            }
            newNode.next=current.next;
            current.next = newNode;

     }

    void AddBefore(int target,int val){
        Node newNode =  new Node(val);
        Node current = head;
        Node prev = null;
        if (head == null){
            System.out.println("No Node found!");
            return;
        }

        if(current.data==target){
            newNode.next=current;
            head =  newNode;
            return;
        }


        while(current.data!=target){
            prev = current;
            current=current.next;
        }

        if(current==null){
            System.out.println("Target is not exist");
            return;
        }
          newNode.next = current;
          prev.next = newNode;
     }
    void DeleteFront(){
        Node current = head;
        if(head ==Tail){
            head = null;
            Tail = null;
            return;
        }

       head  =  head.next;

    }

    void DeleteAfter(int target){
        Node current = head;

        if(head==null){
            System.out.println("Linked List is Empty!");
            return;
        }

        
        while(current !=null &&  current.data != target){
            current = current.next;
        }

        if(current.next==null){
            System.out.println("No node there");
            return;
        }

        if(current.next.next==Tail){
            Tail = current.next;
        }

        
        current.next = current.next.next;

    }
    void DeleteBack(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        if(head ==Tail){
            head=null;
            Tail=null;
            return;
        }

        Node current = head;

        while(current.next != Tail){
            current= current.next;
        }

        current.next = null;

        Tail = current;
    }

    void Display(){
        Node current = head;

        while(current!=null){
            System.out.println(current.data +" ");
            current=current.next;
        }
    }

    public static void main(String []args){
        LinkedTail LT = new LinkedTail();

        LT.Addfront(50);
        LT.Addfront(90);
        LT.Addfront(30);
        LT.Addback(70);
        LT.AddAfter(50,80);
        LT.AddBefore(50,40);

    //    LT.DeleteBack();
    //   LT.DeleteFront();
    //    LT.DeleteAfter(50);

        LT.Display();
    }
}