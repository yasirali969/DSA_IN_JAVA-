class Insertion_Ending{

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

        int []arr={2,4,6,8,10};


        for(int i=0;i<arr.length;i++){
        
        if(head==null){
            head=new Node(arr[i]);
            Tail=head;
        }

        else {
            Tail.next=new Node(arr[i]);
            Tail=Tail.next;

        }
        }
    

        Node temp;
        temp=head;

        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        
       
  }
}