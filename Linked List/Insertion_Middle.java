class Insertion_Middle{

  static class Node{
     int data;
     Node next;

     Node(int data){
        this.data=data;
        this.next=null;
     }
  }
  public static void main(String [] args){
        Node head=null;
        Node Tail=null;


        int [] arr={2,3,4,5};

        for(int i = 0; i < arr.length; i++){
            if(head == null){
                head = new Node(arr[i]);
                Tail = head;
            } else {
                Tail.next = new Node(arr[i]);
                Tail = Tail.next;
            }
        }

        int x=3;
        int value=80;
        Node temp=head;
        x--;

        while(x-->0){
            temp=temp.next;
        }

        Node temp2=new Node(value);

        temp2.next=temp.next;
        temp.next=temp2;

        
        Node p=head;
        while(p!=null){
            System.out.print(p.data+" ");
            p=p.next;
        }
  }
}