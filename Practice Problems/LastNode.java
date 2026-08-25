class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
public class LastNode{
    Node head;
    LastNode(){
        head=null;
    }

    public void removeNthFromEnd(Node head,int n){
        Node current=head;
        Node prev=null;
        int size=5;
        int x=size-n;
        while(x > 0){
            prev=current;
            current=current.next;
            x--;
        }
        prev.next=current.next;
            
        }

    void Display(){
        Node temp=head;

        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }


    
        public static void main(String []args){
      int [] arr={1,2,3,4,5};
        Node NewNode=new Node(arr[0]);
        LastNode L = new LastNode();
        L.head=NewNode;

        Node temp=L.head;

    

     for (int i = 1; i < arr.length; i++) {

            Node newNode = new Node(arr[i]);

            temp.next = newNode;

            temp = temp.next;
        }

        System.out.println("Before deletion:");





       int n=2;
       L.removeNthFromEnd(L.head,n);
       L.Display();
    
    
        }
}
