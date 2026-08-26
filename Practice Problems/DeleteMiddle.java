class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class DeleteMiddle{
    Node head;
    
    DeleteMiddle(){
        head = null;
    }

    void RemoveMiddleElement(int n){
        Node current = head;
        Node prev = null;

        while(n > 0){
            prev =  current;
            current = current.next;
            n--;
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
        DeleteMiddle DM = new DeleteMiddle();
        int []arr={1,2,3,4,5,6};
        Node NewNode=new Node(arr[0]);

        DM.head = NewNode;

        Node temp=DM.head;

        for(int i=1;i<arr.length;i++){
            Node newNode=new Node(arr[i]);
            temp.next=newNode;
            temp=temp.next;
        }

        int size =arr.length;
        int n = size / 2 ;
        DM.RemoveMiddleElement(n);
        DM.Display();
    }
}
