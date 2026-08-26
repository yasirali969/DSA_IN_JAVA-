class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class RemoveNth{
    Node head;
    
    RemoveNth(){
        head = null;
    }

    void RemoveNthElement(Node head,int n){
        Node current=head;
        Node prev= null;
      
        int size = 5;
        int x = size-n;
       

        while(x > 0){
            prev=current;
            current=current.next;
            x--;
        }

        prev.next=current.next;

    }

    void Display(){
        Node print=head;

        while(print!=null){
            System.out.println(print.data);
            print=print.next;
        }
    
}


    public static void main(String []args){
        RemoveNth RN = new RemoveNth();
        int []arr={1,2,3,4,5};
        Node NewNode=new Node(arr[0]);

        RN.head = NewNode;

        Node temp=RN.head;

        for(int i=1;i<arr.length;i++){
            Node newNode=new Node(arr[i]);
            temp.next=newNode;
            temp=temp.next;
        }

        int n = 2;
        RN.RemoveNthElement(RN.head,n);
        RN.Display();
    }
}

