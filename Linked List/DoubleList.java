class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class DoubleList{
    Node head;
    Node Tail;
    Node Prev;

    DoubleList(){
        head=null;
        Tail=null;
        Prev=null;
    }

    void Addfront(int data){
        Node newNode = new Node(data);

        if(head==null){
            head = newNode;
            Tail = newNode;
            Prev = newNode;

            return;
        }

        newNode.next = head;
        head = newNode;

    }

     void AddBack(int data){
        Node newNode =  new Node(data);

        if(head==null){
            head = newNode;
            Tail = newNode;
            Prev = newNode;
        }

        Node current = head;

        
        
        current.next= newNode;

     }
        
    

    void Display(){
        Node current = head;

        while(current!=null){
            System.out.println(current.data +" ");
            current=current.next;
        }
    }


    public static void main(String []args){
        DoubleList DL = new DoubleList();

        DL.Addfront(90);
        DL.Addfront(80);
        DL.AddBack(70);

        DL.Display();
    }
}