class Insertion2{

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


        int [] arr={2,3,4,5};

        for(int i=0;i<arr.length;i++){
        if(head==null){
            head=new Node(arr[i]);
        }

        else{
            Node temp;
            temp=new Node(arr[i]);
            temp.next=head;
            head=temp;
        }
     }
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
  }
}