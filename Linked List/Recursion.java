class Recursion{

  static class Node{
     int data;
     Node next;

     Node(int data){
        this.data=data;
        this.next=null;
     }
  }
  Node Recursive(int index,int size,int []arr){

        if(index==size){
            return null;
        }

        else {
            Node temp;
            temp=new Node(index);
            temp.next=Recursive( index+1, size,arr);
            return temp;
        }
  }

  public static void main(String [] args){

    int [] arr= {2,4,6,8,10};
    Node Head=null;

    Head=Recursive(0,4,arr);

    Node temp=head;

        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

  }
}