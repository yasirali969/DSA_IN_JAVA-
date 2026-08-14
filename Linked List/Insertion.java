class Insertion{

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

        Node newnode=new Node(34);

        if(head==null){
            head=newnode;
        }
        System.out.println("First node ="+ head.data);
  }
}